package com.matheus.cursomc.services;

import com.matheus.cursomc.domain.Cliente;
import com.matheus.cursomc.repositories.ClienteRepository;
import com.matheus.cursomc.services.exception.NotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matheus
 */
@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NotFoundException(
                "Objeto de id " + id + " não encontrado!!"));
    }

}
