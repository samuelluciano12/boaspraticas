package com.example.demo.service;

import com.example.demo.Entity.Produto;
import com.example.demo.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Flux<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    public Mono<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Mono<Produto> salvar (Produto produto){
        return produtoRepository.save(produto);
    }

    public Mono<Void> deletar(Long id){
        return produtoRepository.deleteById(id);
    }

}
