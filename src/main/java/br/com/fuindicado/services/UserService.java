package br.com.fuindicado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fuindicado.models.UserModel;
import br.com.fuindicado.repositorys.UserRepository;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserModel save(UserModel user) {
		return userRepository.save(user);
	}
	
	public List<UserModel> getAll() {
		return (List<UserModel>) userRepository.findAll();
	}
	
	public UserModel findById(String id) {
		return userRepository.findOne(id);
	}
	
	
}
