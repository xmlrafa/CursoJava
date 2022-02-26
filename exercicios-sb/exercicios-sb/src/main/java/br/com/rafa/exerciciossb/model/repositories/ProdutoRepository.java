package br.com.rafa.exerciciossb.model.repositories;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.rafa.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
