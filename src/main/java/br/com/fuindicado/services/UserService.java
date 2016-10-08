package br.com.fuindicado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fuindicado.models.User;
import br.com.fuindicado.repositorys.UserRepository;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findOne(id);
	}
	
	
}
