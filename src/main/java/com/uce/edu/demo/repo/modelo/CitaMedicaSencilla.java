package com.uce.edu.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaSencilla {

	private String numeroCita;

	private LocalDateTime fechaCita;

	private BigDecimal valorCita;

	private LocalDateTime fechaDeControl;

	public CitaMedicaSencilla() {

	}

	public CitaMedicaSencilla(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita,
			LocalDateTime fechaDeControl) {

		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.fechaDeControl = fechaDeControl;
	}

	
	// SET Y GET
	
	public String getNumeroCita() {
		return numeroCita;
	}

	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public LocalDateTime getFechaDeControl() {
		return fechaDeControl;
	}

	public void setFechaDeControl(LocalDateTime fechaDeControl) {
		this.fechaDeControl = fechaDeControl;
	}

}
