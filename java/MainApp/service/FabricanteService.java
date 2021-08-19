package MainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainApp.dao.IFabricanteDAO;
import MainApp.dto.Fabricante;

@Service
public class FabricanteService {
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	public List<Fabricante> listarFabricante() {

		return iFabricanteDAO.findAll();
	}

	public Fabricante guardarFabricante(Fabricante fabricante) {

		return iFabricanteDAO.save(fabricante);
	}

	public Fabricante fabricanteXID(Long id) {

		return iFabricanteDAO.findById(id).get();
	}

	public Fabricante actualizarFabricante(Fabricante fabricante) {

		return iFabricanteDAO.save(fabricante);
	}

	public void eliminarFabricante(Long id) {

		iFabricanteDAO.deleteById(id);

	}
}