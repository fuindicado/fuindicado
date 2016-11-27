package br.com.fuindicado.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.fuindicado.models.Alunos;

public interface IMongo extends PagingAndSortingRepository<Alunos, Long>{

}
