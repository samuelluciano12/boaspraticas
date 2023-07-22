package com.example.demo.Controllers;

import com.example.demo.Entity.Produto;
import com.example.demo.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutoController {


    private final ProdutoService produtoService;

    @GetMapping
    public Flux<Produto> listarTodos(){
        return produtoService.listarTodos();
    }
    @GetMapping("/{id}")
    public Mono<Produto> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public Mono<Produto> salvar(@RequestBody Produto produto){
        return produtoService.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletar(@PathVariable Long id){
        return produtoService.deletar(id);
    }
}
