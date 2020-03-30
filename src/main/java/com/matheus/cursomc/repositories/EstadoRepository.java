
package com.matheus.cursomc.repositories;

import com.matheus.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Matheus
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    
}
