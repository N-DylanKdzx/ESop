package pe.edu.upeu.Sop.service;

import java.util.List;

import java.util.Optional;

import pe.edu.upeu.Sop.entity.Forma_Pago;

public interface Forma_PagoService {
	Forma_Pago create(Forma_Pago a);
	Forma_Pago update(Forma_Pago a);
	void delete(Long id);
	Optional<Forma_Pago> read(Long id);
	List<Forma_Pago> readAll();
}
