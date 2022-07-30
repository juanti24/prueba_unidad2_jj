package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repo.ICitaMedicaRepo;
import com.uce.edu.demo.repo.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepo icitaMedicaRepo;
	
	@Override
	public void insertar(CitaMedica cm) {
		this.icitaMedicaRepo.insertar(cm);
		
	}

	@Override
	public List<CitaMedica> reporteCitas(LocalDateTime fechaControl, BigDecimal valorCita) {
		// TODO Auto-generated method stub
		return this.reporteCitas(fechaControl, valorCita);
	}

	@Override
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		this.icitaMedicaRepo.actualizarCita(numeroCita, diagnostico, receta, fechaControl);
	}

}
