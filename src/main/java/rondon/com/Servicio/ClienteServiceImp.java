package rondon.com.Servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rondon.com.Interfaz.ICliente;
import rondon.com.Modelo.Cliente;

@Service
public class ClienteServiceImp implements ClienteService{
	@Autowired
	private ICliente repository;
	
	@Override
	public Collection<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return (Collection<Cliente>) repository.findAll();
	}

	@Override
	@Transactional
	public void insertar(Cliente cliente) {
		repository.save(cliente);
		
	}

	@Override
	@Transactional
	public void modificar(Cliente cliente) {
		repository.save(cliente);		
		
	}
	

	@Override
	@Transactional
	public void eliminar(Integer clienteId) {
		repository.deleteById(clienteId); 
		
	}

	@Override
	@Transactional
	public Cliente buscar(Integer clienteId) {
		// TODO Auto-generated method stub
		return repository.findById(clienteId).orElse(null);
	}
}
