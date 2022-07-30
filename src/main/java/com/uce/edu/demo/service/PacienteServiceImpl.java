package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repo.IPacienteRepo;
import com.uce.edu.demo.repo.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private  IPacienteRepo  ipacienteRepo ;
	
	
	@Override
	public void insertar(Paciente p) {
		// TODO Auto-generated method stub
		this.ipacienteRepo.insertar(p);
		
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ipacienteRepo.buscar(id);
	}

	@Override
	public void actualizar(Paciente p) {
		// TODO Auto-generated method stub
		this.ipacienteRepo.actualizar(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ipacienteRepo.eliminar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.ipacienteRepo.buscarPorCedula(cedula);
	}

}
