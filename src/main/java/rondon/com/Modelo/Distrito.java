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
import javax.persistence.Table;

@Entity
@Table(name="distrito")
public class Distrito {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iddistrito;
	
	@ManyToOne
	@JoinColumn(name="idprovincia",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(idprovincia) references provincia"))
	private Provincia provincia;
	
	private String detalle;

	public Distrito(Integer iddistrito, Provincia provincia, String detalle) {
		super();
		this.iddistrito = iddistrito;
		this.provincia = provincia;
		this.detalle = detalle;
	}

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
