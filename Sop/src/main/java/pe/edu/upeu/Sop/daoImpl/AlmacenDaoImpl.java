package pe.edu.upeu.Sop.daoImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.Sop.dao.AlmacenDao;
import pe.edu.upeu.Sop.entity.Almacen;
import pe.edu.upeu.Sop.repository.AlmacenRepository;

@Component
public class AlmacenDaoImpl implements AlmacenDao{

	@Autowired
	private AlmacenRepository repository;
	
	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
