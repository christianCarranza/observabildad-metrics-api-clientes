package pe.edu.galaxy.training.java.apiclientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "CLIENTE")
@Entity(name = "Cliente")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCliente")
	@SequenceGenerator(sequenceName = "SEQ_CLIENTE", allocationSize = 1, name = "seqCliente")
	private Long id;

	@Column(name = "RAZON_SOCIAL")
	private String razonSocial;

	@Column(name = "RUC")
	private String ruc;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "TELEFONO")
	private String telefono;

	/*
	@Column(name = "COMENTARIO")
	private String comentario;
	*/
	
	@Column(name = "ESTADO")
	@Builder.Default
	private String estado = "1";

}