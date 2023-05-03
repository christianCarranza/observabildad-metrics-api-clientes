package pe.edu.galaxy.training.java.apiclientes.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.galaxy.training.java.apiclientes.entity.Cliente;
import pe.edu.galaxy.training.java.apiclientes.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	private ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository=clienteRepository;
	}

	@Override
	public List<Cliente> findAll() {

		return clienteRepository.findAllCustom();
	}

	@Override
	public Cliente insert(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
