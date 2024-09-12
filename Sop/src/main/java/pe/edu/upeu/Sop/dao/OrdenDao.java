package pe.edu.upeu.Sop.dao;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Sop.entity.Orden;

public interface OrdenDao {

	Orden create(Orden a);
	Orden update(Orden a);
	void delete(Long id);
	Optional<Orden> read(Long id);
	List<Orden> readAll();
}