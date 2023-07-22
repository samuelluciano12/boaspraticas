package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ExternalApiService {
    private final WebClient webClient;

    public ExternalApiService(){
        this.webClient = WebClient.create("http://localhost:8080");
    }

    public Flux<String> getAlunos(){
        return webClient.get()
                .uri("/listaralunos")
                .retrieve()
                .bodyToFlux(String.class)
                .flatMap(response -> {
                    if (response != null && !response.isEmpty() ){
                        return Flux.just(response);
                    }
                    return Flux.empty();
                });

    }
    public Mono<String> getAlunoById(Long id){
        return webClient.get()
                .uri("/listaraluno/" + id)
                .retrieve()
                .bodyToMono(String.class)
                .flatMap(response -> {
                    if (response != null && !response.isEmpty() ){
                        return Mono.just(response);
                    }
                    return Mono.empty();
                });
    }

}
