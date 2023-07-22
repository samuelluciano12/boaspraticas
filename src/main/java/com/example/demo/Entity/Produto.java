package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;
}
