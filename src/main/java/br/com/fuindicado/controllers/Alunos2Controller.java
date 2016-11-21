package br.com.fuindicado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuindicado.models.Alunos;
import br.com.fuindicado.services.Alunos2Service;

@RestController
@RequestMapping("/alunos")
public class Alunos2Controller {
	
	@Autowired
	private Alunos2Service service;
	
	@RequestMapping(method = RequestMethod.GET)
	public void save(){
		Alunos a = new Alunos();
		a.setFirstname("Primeiro registro First Name");
		a.setLastname("Primeiro registro Last Name");
		service.save(a);
	}

}
