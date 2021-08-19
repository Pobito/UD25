package MainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import MainApp.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}
