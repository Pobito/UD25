package MainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MainApp.dto.Articulo;
import MainApp.service.ArticuloService;


@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloService articuloService;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloService.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo guardarCliente(@RequestBody Articulo articulo) {
		return articuloService.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo articuloXID (@PathVariable(name="id") Long id) {
		Articulo cliente_xid = new Articulo();
		cliente_xid = articuloService.articuloXID(id);
		return cliente_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id") Long id, @RequestBody Articulo articulo) {
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado = articuloService.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloService.actualizarArticulo(articulo_seleccionado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarVideo (@PathVariable(name="id") Long id) {
		articuloService.eliminarArticulo(id);
	}
}
