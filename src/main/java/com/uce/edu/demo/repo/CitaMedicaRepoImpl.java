package com.uce.edu.demo.repo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repo.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica cm) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cm);

	}

	@Override
	public CitaMedica buscarPorNumeroCita(String numeroCita) {
		TypedQuery<CitaMedica> miTypedQuery = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c WHERE c.numeroCita = :datoNumeroCita", CitaMedica.class);
		miTypedQuery.setParameter("datoNumeroCita", numeroCita);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {

		CitaMedica cm = this.buscarPorNumeroCita(numeroCita);
		cm.setNumeroCita(numeroCita);
		cm.setDiagnostico(diagnostico);
		cm.setReceta(receta);
		cm.setFechaDeControl(fechaControl);
		this.entityManager.merge(cm);

	}

	@Override
	public List<CitaMedica> reporteCitas(LocalDateTime fechaControl, BigDecimal valorCita) {
		TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repo.modelo.CitaMedicaSencilla (c.numCita,c.fechaCita,c.valorCita, c.fechaDeControl) FROM CitaMedica c WHERE c.fechaCita > :datoFecha AND c.valorCita = :datoValor",
				CitaMedica.class);
		myQuery.setParameter("datoFecha", fechaControl);
		myQuery.setParameter("datoValor", valorCita);
		return myQuery.getResultList();
	}

}
