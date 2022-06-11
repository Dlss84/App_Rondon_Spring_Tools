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
	
	@ManyToOne
	@JoinColumn(name="id_tipdoc",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(id_tipdoc) references tip_doc")) 
	private Tip_Doc tipdoc;
	
	@ManyToOne
	@JoinColumn(name="iddepartamento",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(iddepartamento) references departamento")) 
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name="idprovincia",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(idprovincia) references provincia"))
	private Provincia provincia;
	
	@ManyToOne
	@JoinColumn(name="iddistrito",nullable=false,unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = 
	"foreign key(iddistrito) references distrito"))
	private Distrito distrito;

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

	public Tip_Doc getTipdoc() {
		return tipdoc;
	}

	public void setTipdoc(Tip_Doc tipdoc) {
		this.tipdoc = tipdoc;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Empleado(Integer id_emp, String nombre, String apell, Integer num_doc, String direccion, String correo,
			Integer telefono, String estado, Tip_Doc tipdoc, Departamento departamento, Provincia provincia,
			Distrito distrito) {
		super();
		this.id_emp = id_emp;
		this.nombre = nombre;
		this.apell = apell;
		this.num_doc = num_doc;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.tipdoc = tipdoc;
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
	}

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
