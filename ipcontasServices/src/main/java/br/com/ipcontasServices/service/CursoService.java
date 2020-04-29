package br.com.ipcontasServices.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.ipcontasServices.model.CursoModel;

@Service
public interface CursoService {
	
	public void addListaCurso(CursoModel curso);
	
	public void carregaTeste();
	
	public Map<Integer, CursoModel> retornaListaCurso();
}
