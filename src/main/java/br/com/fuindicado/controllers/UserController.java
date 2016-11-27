package br.com.fuindicado.controllers;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fuindicado.models.UserModel;
import br.com.fuindicado.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserModel findById(@PathVariable("id") String id) {
		
		return userService.findById(id);
	
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> save(@Valid @RequestBody UserModel user) {
		
		user.setCreatedDate(new Date());
		UserModel userReturned = userService.save(user);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
							.path("/{id}").buildAndExpand(userReturned.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> getAll() {
		//Teste para inserir um dado!
		UserModel user = new UserModel("Rafael2", "111111111111112", "13211111112", 
				"Endereço teste2", "1111111111112", "teste2@teste.com", 
				"rafael2", "teste2", new Date());
		
		UserModel userReturned = userService.save(user);
		//Fim do teste!
		
		List<UserModel> users = userService.getAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}

}







