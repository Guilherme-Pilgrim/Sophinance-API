package com.sophinance.api.services;

import com.sophinance.api.models.Usuarios;
import com.sophinance.api.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository repository;

    public Usuarios cadastrar(Usuarios usuario) {
        String cpfLimpo = limparCpf(usuario.getCpf());
        usuario.setCpf(cpfLimpo);
        return repository.save(usuario);
    }

    private String limparCpf(String cpfComMascara) {
        if (cpfComMascara == null) return null;
        return cpfComMascara.replaceAll("\\D", "");
    }
}