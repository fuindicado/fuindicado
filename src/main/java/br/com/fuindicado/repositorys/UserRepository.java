package br.com.fuindicado.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.fuindicado.models.UserModel;

public interface UserRepository extends PagingAndSortingRepository<UserModel, String>{

}
