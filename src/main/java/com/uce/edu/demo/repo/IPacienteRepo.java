package com.uce.edu.demo.repo;

import com.uce.edu.demo.repo.modelo.Paciente;

public interface IPacienteRepo {

	public void insertar(Paciente p);

	public Paciente buscar(Integer id);

	public void actualizar(Paciente p);

	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);

}
