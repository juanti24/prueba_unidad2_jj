package com.uce.edu.demo.repo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repo.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void insertar(CitaMedica cm);

	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl);

	public CitaMedica buscarPorNumeroCita(String numeroCita);
	
	public List<CitaMedica> reporteCitas(LocalDateTime fechaControl, BigDecimal valorCita);
}
