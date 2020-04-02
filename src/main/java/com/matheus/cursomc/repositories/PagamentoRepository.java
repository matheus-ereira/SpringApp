
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    
}
