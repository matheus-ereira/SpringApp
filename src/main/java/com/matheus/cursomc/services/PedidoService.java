package com.matheus.cursomc.services;

import com.matheus.cursomc.domain.Pedido;
import com.matheus.cursomc.repositories.PedidoRepository;
import com.matheus.cursomc.services.exception.NotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matheus
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NotFoundException(
        "Objeto de id "+ id + " não encontrado!!"));
    }
}
