package com.usuario.service.UsuarioRepository;

import com.usuario.service.com.usuario.servicio.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
