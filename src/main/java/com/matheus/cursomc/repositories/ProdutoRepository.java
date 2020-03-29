
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
