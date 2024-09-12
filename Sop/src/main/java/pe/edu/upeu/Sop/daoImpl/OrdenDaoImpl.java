package pe.edu.upeu.Sop.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Sop.dao.OrdenDao;
import pe.edu.upeu.Sop.entity.Orden;
import pe.edu.upeu.Sop.repository.OrdenRepository;
@Component
public class OrdenDaoImpl implements OrdenDao {

	@Autowired
	private OrdenRepository repository;
	
	@Override
	public Orden create(Orden a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Orden update(Orden a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Orden> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Orden> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
