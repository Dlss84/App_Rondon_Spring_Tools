package rondon.com.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iddepartamento;
	private String detalle;
	
	
	public Departamento(Integer iddepartamento, String detalle) {
		super();
		this.iddepartamento = iddepartamento;
		this.detalle = detalle;
	}


	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
