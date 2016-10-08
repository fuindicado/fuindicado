package br.com.fuindicado.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fuindicado.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
