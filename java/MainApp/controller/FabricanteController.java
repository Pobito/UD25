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

import MainApp.dto.Fabricante;
import MainApp.service.FabricanteService;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteService fabricanteService;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteService.listarFabricante();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteService.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id")Long id) {
		Fabricante fabricante_xid = new Fabricante();
		
		fabricante_xid = fabricanteService.fabricanteXID(id);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id") Long id, @RequestBody Fabricante fabricante) {
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado = fabricanteService.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable(name="id") Long id) {
		fabricanteService.eliminarFabricante(id);
	}
}
