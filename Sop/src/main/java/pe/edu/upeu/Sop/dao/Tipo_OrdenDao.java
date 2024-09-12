package pe.edu.upeu.Sop.dao;
import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Sop.entity.Tipo_Orden;

public interface Tipo_OrdenDao {

	Tipo_Orden create(Tipo_Orden a);
	Tipo_Orden update(Tipo_Orden a);
	void delete(Long id);
	Optional<Tipo_Orden> read(Long id);
	List<Tipo_Orden> readAll();
}