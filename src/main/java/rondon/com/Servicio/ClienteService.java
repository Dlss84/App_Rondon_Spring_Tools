package rondon.com.Servicio;

import java.util.Collection;



import rondon.com.Modelo.Cliente;


public interface ClienteService {

	public abstract Collection<Cliente> listarCliente();
	public abstract void insertar(Cliente cliente);
	public abstract void modificar(Cliente cliente);
	public abstract void eliminar(Integer clienteId);
	public abstract Cliente buscar(Integer clienteId);
}
