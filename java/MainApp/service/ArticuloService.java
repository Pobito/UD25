package MainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainApp.dao.IArticuloDAO;
import MainApp.dto.Articulo;

@Service
public class ArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;

	public List<Articulo> listarArticulos() {

		return iArticuloDAO.findAll();
	}

	public Articulo guardarArticulo(Articulo articulo) {

		return iArticuloDAO.save(articulo);
	}

	public Articulo articuloXID(Long id) {

		return iArticuloDAO.findById(id).get();
	}

	public Articulo actualizarArticulo(Articulo articulo) {

		return iArticuloDAO.save(articulo);
	}

	public void eliminarArticulo(Long id) {

		iArticuloDAO.deleteById(id);

	}
}
