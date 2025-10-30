package me.registro.usuario.servicio;

import me.registro.usuario.dto.UsuarioRegistroDTO;
import me.registro.usuario.modelo.Usuario;

import java.util.List;


public interface UsuarioServicio {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();

}
