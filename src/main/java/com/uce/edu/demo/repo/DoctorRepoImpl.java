package com.uce.edu.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repo.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor d) {
		this.entityManager.persist(d);

	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.entityManager.merge(d);

	}

	@Override
	public void eliminar(Integer id) {

		Doctor d = new Doctor();

		this.entityManager.remove(d);

	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		TypedQuery<Doctor> miTypedQuery = this.entityManager.createQuery("SELECT d FROM Doctor d WHERE d.cedula = :datoCedula", Doctor.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();

	}

}
