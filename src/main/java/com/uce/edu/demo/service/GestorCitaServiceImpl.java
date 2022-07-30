package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repo.modelo.CitaMedica;
import com.uce.edu.demo.repo.modelo.Doctor;
import com.uce.edu.demo.repo.modelo.Paciente;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {

	@Autowired
	private IDoctorService idoctorService;

	@Autowired
	private IPacienteService ipacienteService;

	@Autowired
	private ICitaMedicaService icitamedicaService;

	@Autowired
	private static Logger LOG = Logger.getLogger(GestorCitaServiceImpl.class);

	@Override
	public void agendar(String numerCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {

		CitaMedica cm = new CitaMedica();
		cm.setNumeroCita(numerCita);
		cm.setFechaCita(fechaCita);
		cm.setValorCita(valorCita);
		cm.setLugarCita(lugarCita);

		Doctor d = this.idoctorService.buscarPorCedula(cedulaPaciente);
		cm.setDoctor(d);

		Paciente p = this.ipacienteService.buscarPorCedula(cedulaPaciente);
		cm.setPaciente(p);
		this.icitamedicaService.insertar(cm);

	}

	@Override
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		this.actualizarCita(numeroCita, diagnostico, receta, fechaControl);
		
	}

}
