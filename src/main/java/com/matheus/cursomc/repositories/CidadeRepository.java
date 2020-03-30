
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    
}
