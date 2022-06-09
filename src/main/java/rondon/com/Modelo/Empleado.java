package rondon.com.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id_emp;
	
	private String nombre;
	private String apell;
	private Integer num_doc;
	private String direccion;
	private String correo;
	private Integer telefono;
	private String estado;
	private Integer id_tipdoc;
	private Integer idDepartamento;
	private Integer idProvincia;
	private Integer idDistrito;
	public Integer getId_emp() {
		return id_emp;
	}
	public void setId_emp(Integer id_emp) {
		this.id_emp = id_emp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApell() {
		return apell;
	}
	public void setApell(String apell) {
		this.apell = apell;
	}
	public Integer getNum_doc() {
		return num_doc;
	}
	public void setNum_doc(Integer num_doc) {
		this.num_doc = num_doc;
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
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getId_tipdoc() {
		return id_tipdoc;
	}
	public void setId_tipdoc(Integer id_tipdoc) {
		this.id_tipdoc = id_tipdoc;
	}
	public Integer getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public Integer getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}
	public Integer getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}
	public Empleado(Integer id_emp, String nombre, String apell, Integer num_doc, String direccion, String correo,
			Integer telefono, String estado, Integer id_tipdoc, Integer idDepartamento, Integer idProvincia,
			Integer idDistrito) {
		super();
		this.id_emp = id_emp;
		this.nombre = nombre;
		this.apell = apell;
		this.num_doc = num_doc;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.id_tipdoc = id_tipdoc;
		this.idDepartamento = idDepartamento;
		this.idProvincia = idProvincia;
		this.idDistrito = idDistrito;
	}
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
