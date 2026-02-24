package com.sophinance.api.controllers;

import com.sophinance.api.models.Usuarios;
import com.sophinance.api.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:3000")

public class UsuariosController {

    @Autowired
    private UsuariosService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuarios> cadastrar(@RequestBody Usuarios usuario) {
        Usuarios novoUsuario = service.cadastrar(usuario);
        return ResponseEntity.ok(novoUsuario);
    }
}