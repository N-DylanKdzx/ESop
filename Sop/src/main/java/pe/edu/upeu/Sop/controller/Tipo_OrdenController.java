package pe.edu.upeu.Sop.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.Sop.entity.Tipo_Orden;
import pe.edu.upeu.Sop.service.Tipo_OrdenService;
@RestController
@RequestMapping("/api/tipo_Ordenes")
public class Tipo_OrdenController {
	@Autowired
	private Tipo_OrdenService tipo_OrdenService;
	
	@GetMapping
	public ResponseEntity<List<Tipo_Orden>> readAll(){
		try {
			List<Tipo_Orden> tipo_Ordens = tipo_OrdenService.readAll();
			if(tipo_Ordens.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tipo_Ordens, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Tipo_Orden> crear(@Valid @RequestBody Tipo_Orden cat){
		try {
			Tipo_Orden c = tipo_OrdenService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tipo_Orden> getTipo_OrdenId(@PathVariable("id") Long id){
		try {
			Tipo_Orden c = tipo_OrdenService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_Orden> delTipo_Orden(@PathVariable("id") Long id){
		try {
			tipo_OrdenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo_Orden(@PathVariable("id") Long id, @Valid @RequestBody Tipo_Orden cat){

			Optional<Tipo_Orden> c = tipo_OrdenService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(tipo_OrdenService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}