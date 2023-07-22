package com.example.demo.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ExemploStream {

    @GetMapping("exemploStream")
    public static  void main(String[] args){
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int somaDosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("A soma dos numeros pares: " + somaDosPares);
    }
}
