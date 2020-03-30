
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}
