package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repo.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void insertar(CitaMedica cm);
	
	public List<CitaMedica> reporteCitas(LocalDateTime fechaControl, BigDecimal valorCita);
	
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl);
}
