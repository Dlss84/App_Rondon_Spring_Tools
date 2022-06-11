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
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_cliente;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String direccion;
	private String correo;
	private String telefono;
	private String estado;
	/*@ManyToOne
	@JoinColumn(name="id_usu",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(id_usu) references usuario")) */
	private Integer id_usu;
	
	
	
	
	public Integer getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Integer getId_usu() {
		return id_usu;
	}


	public void setId_usu(Integer id_usu) {
		this.id_usu = id_usu;
	}


	public Cliente(Integer id_cliente, String nombre, String apellido, Integer dni, String direccion, String correo,
			String telefono, String estado, Integer id_usu) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.id_usu = id_usu;
	}


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
