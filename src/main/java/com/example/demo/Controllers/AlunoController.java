package com.example.demo.Controllers;

import com.example.demo.DTO.AlunoDTO;
import com.example.demo.service.ExternalApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

    private final ExternalApiService externalApiService;
    @GetMapping
    public Flux<String> getAlunos(){
        return externalApiService.getAlunos();
    }

    @GetMapping("/{id}")
    public Mono<String> getAlunoById(@PathVariable Long id){
        return externalApiService.getAlunoById(id);
    }
}
