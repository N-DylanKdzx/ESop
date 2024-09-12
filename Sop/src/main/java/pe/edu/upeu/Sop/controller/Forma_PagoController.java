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
import pe.edu.upeu.Sop.entity.Forma_Pago;
import pe.edu.upeu.Sop.service.Forma_PagoService;

@RestController
@RequestMapping("/api/forma_pagos")
public class Forma_PagoController {
	@Autowired
	private Forma_PagoService forma_PagoService;
	
	@GetMapping
	public ResponseEntity<List<Forma_Pago>> readAll(){
		try {
			List<Forma_Pago> forma_Pagos = forma_PagoService.readAll();
			if(forma_Pagos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(forma_Pagos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Forma_Pago> crear(@Valid @RequestBody Forma_Pago cat){
		try {
			Forma_Pago c = forma_PagoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Forma_Pago> getForma_PagoId(@PathVariable("id") Long id){
		try {
			Forma_Pago c = forma_PagoService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Forma_Pago> delForma_Pago(@PathVariable("id") Long id){
		try {
			forma_PagoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateForma_Pago(@PathVariable("id") Long id, @Valid @RequestBody Forma_Pago cat){

			Optional<Forma_Pago> c = forma_PagoService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(forma_PagoService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}