package MainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MainApp.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long> {

}
