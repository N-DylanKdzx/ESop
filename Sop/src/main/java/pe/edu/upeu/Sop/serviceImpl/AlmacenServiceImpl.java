package pe.edu.upeu.Sop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Sop.dao.AlmacenDao;
import pe.edu.upeu.Sop.entity.Almacen;
import pe.edu.upeu.Sop.service.AlmacenService;
@Service
public class AlmacenServiceImpl implements AlmacenService {

	@Autowired
	private AlmacenDao dao;

	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
