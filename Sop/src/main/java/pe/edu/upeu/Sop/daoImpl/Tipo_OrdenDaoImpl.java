package pe.edu.upeu.Sop.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Sop.dao.Tipo_OrdenDao;
import pe.edu.upeu.Sop.entity.Tipo_Orden;
import pe.edu.upeu.Sop.repository.Tipo_OrdenRepository;
@Component
public class Tipo_OrdenDaoImpl implements Tipo_OrdenDao{

	@Autowired
	private Tipo_OrdenRepository repository;
	
	@Override
	public Tipo_Orden create(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Tipo_Orden update(Tipo_Orden a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Tipo_Orden> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tipo_Orden> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
