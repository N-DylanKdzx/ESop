package pe.edu.upeu.Sop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Sop.dao.Forma_PagoDao;
import pe.edu.upeu.Sop.entity.Forma_Pago;
import pe.edu.upeu.Sop.service.Forma_PagoService;

@Service
public class Forma_PagoServiceImpl implements Forma_PagoService{

	@Autowired
	private Forma_PagoDao dao;

	@Override
	public Forma_Pago create(Forma_Pago a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Forma_Pago update(Forma_Pago a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Forma_Pago> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Forma_Pago> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
