
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    
}
