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
@Table(name="proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_prov;
	private String nombre;
	private String per_contact;
	private Integer num_doc;
	private Integer telefono;
	private String email;
	private String direccion;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_tipdoc",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(id_tipdoc) references tip_doc")) 
	private Tip_Doc tip_doc;

	public Proveedor(Integer id_prov, String nombre, String per_contact, Integer num_doc, Integer telefono,
			String email, String direccion, String estado, Tip_Doc tip_doc) {
		super();
		this.id_prov = id_prov;
		this.nombre = nombre;
		this.per_contact = per_contact;
		this.num_doc = num_doc;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.estado = estado;
		this.tip_doc = tip_doc;
	}

	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_prov() {
		return id_prov;
	}

	public void setId_prov(Integer id_prov) {
		this.id_prov = id_prov;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPer_contact() {
		return per_contact;
	}

	public void setPer_contact(String per_contact) {
		this.per_contact = per_contact;
	}

	public Integer getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(Integer num_doc) {
		this.num_doc = num_doc;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Tip_Doc getTip_doc() {
		return tip_doc;
	}

	public void setTip_doc(Tip_Doc tip_doc) {
		this.tip_doc = tip_doc;
	}

	
}
