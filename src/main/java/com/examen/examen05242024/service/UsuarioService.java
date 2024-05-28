package com.examen.examen05242024.service;

import com.examen.examen05242024.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getUsuarios();
    Usuario getUsuariosEditar(String login);
    Usuario postUsuario(Usuario usuario);
    //Usuario getUsuario(String usuario);
    void deleteUsuario(String usuario);
    Usuario findUsuarioByLoginAndPassword(String login, String password);
    List<Usuario> activosInactivosRevocados(Character c);
}
