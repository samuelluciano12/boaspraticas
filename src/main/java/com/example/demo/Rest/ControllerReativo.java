package com.example.demo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class ControllerReativo {


    @GetMapping("numeros")
    public Flux<Integer> getNumeros(){

        return Flux.range(1,10)
                .doOnNext(numero -> System.out.println("Numero emitido: " + numero))
                .doOnComplete(() -> System.out.println("Transmissão concluída."));
    }
}
