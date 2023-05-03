package pe.edu.galaxy.training.java.apiclientes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.galaxy.training.java.apiclientes.entity.Cliente;
import pe.edu.galaxy.training.java.apiclientes.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService; 

	@GetMapping
	public List<Cliente> findByLike() {
		return clienteService.findAll();
	}

	@PostMapping
	public Cliente insert(@RequestBody Cliente cliente) {
		try {
			return clienteService.insert(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
