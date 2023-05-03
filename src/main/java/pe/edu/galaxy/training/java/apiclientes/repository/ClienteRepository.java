package pe.edu.galaxy.training.java.apiclientes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.galaxy.training.java.apiclientes.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	@Query("select p from Cliente p where p.estado='1'")					//JPQL ->SQL
	List<Cliente> findAllCustom();
}
