package rondon.com.Modelo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="articulo")
public class Articulo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_art;
	
	private String nombre;
	private Double pre_com;
	private Double pre_vent;
	private Integer stock;
	private Date fvenc;
	private String imagen;
	private String estado;
	public Integer getId_art() {
		return id_art;
	}
	public void setId_art(Integer id_art) {
		this.id_art = id_art;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPre_com() {
		return pre_com;
	}
	public void setPre_com(Double pre_com) {
		this.pre_com = pre_com;
	}
	public Double getPre_vent() {
		return pre_vent;
	}
	public void setPre_vent(Double pre_vent) {
		this.pre_vent = pre_vent;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Date getFvenc() {
		return fvenc;
	}
	public void setFvenc(Date fvenc) {
		this.fvenc = fvenc;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articulo(Integer id_art, String nombre, Double pre_com, Double pre_vent, Integer stock, Date fvenc,
			String imagen, String estado) {
		super();
		this.id_art = id_art;
		this.nombre = nombre;
		this.pre_com = pre_com;
		this.pre_vent = pre_vent;
		this.stock = stock;
		this.fvenc = fvenc;
		this.imagen = imagen;
		this.estado = estado;
	}
	
	
	
	

}
