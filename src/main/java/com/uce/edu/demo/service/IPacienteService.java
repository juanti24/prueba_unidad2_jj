package com.uce.edu.demo.service;

import com.uce.edu.demo.repo.modelo.Paciente;

public interface IPacienteService {
	
	public void insertar(Paciente p);

	public Paciente buscar(Integer id);

	public void actualizar(Paciente p);

	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);


}
