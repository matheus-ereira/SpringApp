package com.matheus.cursomc;

import com.matheus.cursomc.domain.Categoria;
import com.matheus.cursomc.domain.Cidade;
import com.matheus.cursomc.domain.Estado;
import com.matheus.cursomc.domain.Produto;
import com.matheus.cursomc.repositories.CategoriaRepository;
import com.matheus.cursomc.repositories.CidadeRepository;
import com.matheus.cursomc.repositories.EstadoRepository;
import com.matheus.cursomc.repositories.ProdutoRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria categoria1 = new Categoria(null, "Informatica");
        Categoria categoria2 = new Categoria(null, "Escritorio");

        Produto produto1 = new Produto(null, "Computador Gamer", 5000.00);
        Produto produto2 = new Produto(null, "Impressora", 1000.00);
        Produto produto3 = new Produto(null, "Mouse Gamer", 500.00);

        categoria1.getProdutos().addAll(Arrays.asList(produto1, produto3));
        categoria2.getProdutos().addAll(Arrays.asList(produto2));

        produto1.getCategorias().addAll(Arrays.asList(categoria1));
        produto2.getCategorias().addAll(Arrays.asList(categoria1, categoria2));
        produto3.getCategorias().addAll(Arrays.asList(categoria1));

        categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
        produtoRepository.saveAll(Arrays.asList(produto1, produto2, produto3));

        Estado estado1 = new Estado(null, "Minas Gerais", "MG");
        Estado estado2 = new Estado(null, "São Paulo", "SP");

        Cidade cidade1 = new Cidade(null, "Ubêrlandia", estado1);
        Cidade cidade2 = new Cidade(null, "São Paulo", estado2);
        Cidade cidade3 = new Cidade(null, "Campinas", estado2);

        estado1.getCidades().addAll(Arrays.asList(cidade1));
        estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));

        estadoRepository.saveAll(Arrays.asList(estado1, estado2));
        cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));
    }

}
