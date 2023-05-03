package pe.edu.galaxy.training.java.apiclientes.service;

import java.util.List;
import pe.edu.galaxy.training.java.apiclientes.entity.Cliente;

public interface ClienteService {

	List<Cliente> findAll();
	
	Cliente insert(Cliente cliente);
	
}
