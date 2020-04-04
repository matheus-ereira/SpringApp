package com.matheus.cursomc.services;

import com.matheus.cursomc.domain.Categoria;
import com.matheus.cursomc.repositories.CategoriaRepository;
import com.matheus.cursomc.services.exception.NotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matheus
 */
@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;
    
    public Categoria find(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NotFoundException(
                "Objeto de id " + id + " não encontrado!!"));
    }
    
    public Categoria insert(Categoria categoria) {
        categoria.setId(null);
        return repository.save(categoria);
    }
}
