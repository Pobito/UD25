package MainApp.service;

import java.util.List;
import MainApp.dto.Fabricante;

public interface IFabricanteService {
	public List<Fabricante> listarFabricante();
	public Fabricante guardarFabricante(Fabricante fabricante);
	public Fabricante fabricanteXID (Long id);
	public Fabricante actualizarFabricante(Fabricante fabricante);
	public void eliminarFabricante (Long id);
}
