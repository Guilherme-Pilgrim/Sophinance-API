package com.sophinance.api.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_sfin_usuarios")
@Data // Gera Getters, Setters, toString e Equals/HashCode
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = true, length = 11)
    private String numeroCelular;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    // Método para preencher a data automaticamente antes de salvar
    @PrePersist
    protected void onCreate() {
        dataCriacao = LocalDateTime.now();
    }
}
