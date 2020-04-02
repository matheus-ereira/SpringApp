
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
    
}
