package com.examen.examen05242024.repository;

import com.examen.examen05242024.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    //Usuario findUsuarioByLoginAndPassword(String login, String password);

    @Query("select u from Usuario u where u.login = ?1 and u.password = ?2 and u.fechaVigencia >= curdate()" )
    Usuario findUsuarioByLoginAndPassword(String login, String password);

    @Query("select u from Usuario u where u.status = ?1")
    List<Usuario> findUsuariobyLetter(Character c);
}
