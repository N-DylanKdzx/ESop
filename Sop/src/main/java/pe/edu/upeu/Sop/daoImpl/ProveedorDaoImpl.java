package pe.edu.upeu.Sop.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Sop.dao.ProveedorDao;
import pe.edu.upeu.Sop.entity.Proveedor;
import pe.edu.upeu.Sop.repository.ProveedorRepository;
@Component
public class ProveedorDaoImpl implements ProveedorDao {

	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public Proveedor create(Proveedor a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Proveedor update(Proveedor a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
