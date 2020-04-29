package br.com.ipcontasServices.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ipcontasServices.model.CursoModel;
import br.com.ipcontasServices.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	CursoService cursoService;

	public CursoController() {
		
	}

	@RequestMapping(value = "/cursos", method = RequestMethod.GET)
	public ResponseEntity<Map<Integer, CursoModel>> listar() {
		cursoService.carregaTeste();
		return new ResponseEntity<Map<Integer, CursoModel>>(cursoService.retornaListaCurso(), HttpStatus.OK);
	}
}
