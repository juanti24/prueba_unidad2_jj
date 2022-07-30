package com.uce.edu.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repo.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente p) {
		this.entityManager.persist(p);
		
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Paciente p) {
		// TODO Auto-generated method stub
		this.entityManager.merge(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Paciente p = new Paciente();
		this.entityManager.remove(p);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> miTypedQuery = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :datoCedula", Paciente.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();

	}

}
