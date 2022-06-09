package rondon.com.Servicio;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import rondon.com.Interfaz.IArticulo;
import rondon.com.Modelo.Articulo;


public interface ArticuloService {
	public abstract Collection<Articulo> listarArticulo();
	public abstract void insertar(Articulo articulo);
	public abstract void modificar(Articulo articulo);
	public abstract void eliminar(Integer articuloId);
	public abstract Articulo buscar(Integer articuloId);
	
}
