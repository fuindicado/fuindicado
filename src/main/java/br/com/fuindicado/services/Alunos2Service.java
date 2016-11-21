package br.com.fuindicado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fuindicado.models.Alunos;
import br.com.fuindicado.repositorys.IMongo;

@Service
@Transactional(rollbackFor=Exception.class)
public class Alunos2Service {
	
	@Autowired
	private IMongo mongo;
	
	public void save(Alunos a) {
		mongo.save(a);
	}

}
