package com.sophinance.api.repositories;

import com.sophinance.api.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {
    // Isso aqui vai nos ajudar no login mais tarde
    Optional<Usuarios> findByEmail(String email);
}