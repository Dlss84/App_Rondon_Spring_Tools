package rondon.com.Modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idprovincia;
	
	@ManyToOne
	@JoinColumn(name="iddepartamento",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(iddepartamento) references departamento")) 
	private Departamento departamento;
	
	private String detalle;

	public Provincia(Integer idprovincia, Departamento departamento, String detalle) {
		super();
		this.idprovincia = idprovincia;
		this.departamento = departamento;
		this.detalle = detalle;
	}

	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
