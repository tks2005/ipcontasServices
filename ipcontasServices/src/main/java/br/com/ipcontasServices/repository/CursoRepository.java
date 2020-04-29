package br.com.ipcontasServices.repository;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.ipcontasServices.model.CursoModel;
import br.com.ipcontasServices.service.CursoService;

@Repository
public class CursoRepository implements CursoService{

	Logger logger = LoggerFactory.getLogger(CursoRepository.class);
	
	private int idCurso;
	private Map<Integer, CursoModel> cursos;
	
	public void addListaCurso(CursoModel curso){
		cursos.put(idCurso, curso);
	}

	public void carregaTeste() {
		
		idCurso = 0;
		
		logger.info("carregaTeste()> Carregando cursos ficticios...");
		addListaCurso(new CursoModel(++idCurso, "Workshop Rest", "24hs"));
		addListaCurso(new CursoModel(++idCurso, "Workshop Spring MVC", "24hs"));
		addListaCurso(new CursoModel(++idCurso, "Desenvolvimento Web com JSF 2", "60hs"));
		logger.info("carregaTeste()< Cursos ficticios carregados");
		logger.error("Exemplo de erro");
		logger.warn("Exemplo de warn");
	}

	public Map<Integer, CursoModel> retornaListaCurso() {
		return cursos;
	}

	
}
