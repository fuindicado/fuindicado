package br.com.fuindicado.exceptions.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import br.com.fuindicado.exceptions.ExistUserException;
import br.com.fuindicado.models.DetalhesErros;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ExistUserException.class)
	public ResponseEntity<DetalhesErros> handleLivroNaoEncontradoException (ExistUserException e, HttpServletRequest request) {
		
		DetalhesErros detalhesErros = new DetalhesErros("Usuário existente", "Já existe um usuário com essa informação", 409L, System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(detalhesErros);
	}

}
