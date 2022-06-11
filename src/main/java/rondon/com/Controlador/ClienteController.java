package rondon.com.Controlador;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rondon.com.Modelo.Cliente;
import rondon.com.Servicio.ClienteService;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/listar") // Http Method GET
	public ResponseEntity<?> listar() {
		Collection<Cliente> itemsCliente = servicio.listarCliente();
		return new ResponseEntity<>(itemsCliente, HttpStatus.OK); // Http status code
	}
	
	@GetMapping("/buscar/{clienteId}") // Http Method GET
	public ResponseEntity<?> buscar(@PathVariable Integer clienteId) {
		Cliente ClienteDb = servicio.buscar(clienteId);

		if (ClienteDb != null) {
			return new ResponseEntity<>(ClienteDb, HttpStatus.OK); // Http status code
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); // Http status code
	}

	@PostMapping("/agregar") // Http Method POST
	public ResponseEntity<?> agregar(@RequestBody Cliente cliente) {
		servicio.insertar(cliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED); // Http status code
	}

	@PutMapping("/editar/{clienteId}") // Http Method PUT
	public ResponseEntity<?> editar(@PathVariable Integer clienteId, @RequestBody Cliente newCliente) {
		Cliente ClienteDb = servicio.buscar(clienteId);

		if (ClienteDb != null) {
			ClienteDb.setNombre(newCliente.getNombre());
			ClienteDb.setApellido(newCliente.getApellido());
			ClienteDb.setDni(newCliente.getDni());
			ClienteDb.setDireccion(newCliente.getDireccion());
			ClienteDb.setCorreo(newCliente.getCorreo());
			ClienteDb.setTelefono(newCliente.getTelefono());
			ClienteDb.setEstado(newCliente.getEstado());
			ClienteDb.setId_usu(newCliente.getId_usu());
			
			servicio.modificar(ClienteDb);
			return new ResponseEntity<Void>(HttpStatus.OK); // Http status code
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); // Http status code
	}

	@DeleteMapping("/borrar/{clienteId}") // Http Method DELETE
	public ResponseEntity<?> borrar(@PathVariable Integer clienteId) {
		Cliente ClienteDb = servicio.buscar(clienteId);

		if (ClienteDb != null) {
			servicio.eliminar(clienteId);
			return new ResponseEntity<Void>(HttpStatus.OK); // Http status code
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); // Http status code
	}
}
