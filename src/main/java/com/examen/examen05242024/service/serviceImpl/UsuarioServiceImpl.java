package com.examen.examen05242024.service.serviceImpl;

import com.examen.examen05242024.entity.Usuario;
import com.examen.examen05242024.repository.UsuarioRepository;
import com.examen.examen05242024.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuariosEditar(String login) {
        return usuarioRepository.findById(login).orElse(null);
    }

    @Override
    public Usuario postUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    /*@Override
    public Usuario getUsuario(String usuario) {
        return usuarioRepository.findById(usuario).orElse(null);
    }*/

    @Override
    public void deleteUsuario(String usuario) {
        usuarioRepository.deleteById(usuario);
    }

    @Override
    public Usuario findUsuarioByLoginAndPassword(String login, String password) {
        return usuarioRepository.findUsuarioByLoginAndPassword(login, password);
    }

    @Override
    public List<Usuario> activosInactivosRevocados(Character c) {
        return usuarioRepository.findUsuariobyLetter(c);
    }

}
