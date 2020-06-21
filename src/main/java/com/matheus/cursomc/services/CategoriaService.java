package com.matheus.cursomc.services;

import com.matheus.cursomc.domain.Categoria;
import com.matheus.cursomc.dto.CategoriaDTO;
import com.matheus.cursomc.repositories.CategoriaRepository;
import com.matheus.cursomc.services.exception.DataIntegrityException;
import com.matheus.cursomc.services.exception.NotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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

    public Categoria update(Categoria categoria) {
        find(categoria.getId());
        return repository.save(categoria);
    }

    public void delete(Integer id) {
        find(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir categorias que possuem produtos!!");
        }
    }

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
        return repository.findAll(pageRequest);
    }
    
    public Categoria fromDTO(CategoriaDTO objDTO){
        return new Categoria(objDTO.getId(), objDTO.getNome());
    }
}
