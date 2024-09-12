package pe.edu.upeu.Sop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Sop.dao.ProveedorDao;
import pe.edu.upeu.Sop.entity.Proveedor;
import pe.edu.upeu.Sop.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorDao dao;

	@Override
	public Proveedor create(Proveedor a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Proveedor update(Proveedor a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
