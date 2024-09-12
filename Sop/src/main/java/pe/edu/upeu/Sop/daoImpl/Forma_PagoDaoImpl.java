package pe.edu.upeu.Sop.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.Sop.dao.Forma_PagoDao;
import pe.edu.upeu.Sop.entity.Forma_Pago;
import pe.edu.upeu.Sop.repository.Forma_PagoRepository;
@Component
public class Forma_PagoDaoImpl implements Forma_PagoDao{

	@Autowired
	private Forma_PagoRepository repository;
	
	@Override
	public Forma_Pago create(Forma_Pago a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Forma_Pago update(Forma_Pago a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Forma_Pago> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Forma_Pago> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
