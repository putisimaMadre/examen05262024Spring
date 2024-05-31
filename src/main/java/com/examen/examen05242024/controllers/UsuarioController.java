package com.examen.examen05242024.controllers;

import com.examen.examen05242024.entity.Usuario;
import com.examen.examen05242024.service.UsuarioService;
import com.examen.examen05242024.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private Utils utils;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/busquedaLetra/{letra}")
    public List<Usuario> getBusqueda(@PathVariable Character letra){
        return usuarioService.activosInactivosRevocados(letra);
    }

    @GetMapping("/usuarios/{login}")
    public Usuario getUsuarioEditar(@PathVariable String login){
        return usuarioService.getUsuariosEditar(login);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> postUsuarios(@RequestBody Usuario usuario){
        Usuario usuarioNew = null;
        Map<String, Object> response = new HashMap<>();
        try{
            usuario.setPassword(utils.Encriptar(usuario.getPassword()));
            usuarioNew = usuarioService.postUsuario(usuario);
        }catch(DataAccessException e){
            response.put("mensaje:", "Problema al insertar a la base de datos");
            response.put("error: ", e.getMessage().concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje: ", "Usuario creado correctamente");
        response.put("Usuario nuevo:", usuarioNew);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> getUsuario(@RequestBody Usuario usuariob){
        System.out.println(usuariob.getLogin());
        System.out.println(usuariob.getPassword());
        Usuario usuario= null;
        Map<String, Object> response = new HashMap<>();
        String passConvertido = utils.Encriptar(usuariob.getPassword());
        try{
            usuario = usuarioService.findUsuarioByLoginAndPassword(usuariob.getLogin(), passConvertido);
        }catch(DataAccessException e){
            response.put("mensage: ", "Error en la base de datos".concat(e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (usuario == null){
            response.put("mensage: ", "El id ".concat(usuariob.getLogin()).concat(" no existe"));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/usuarios/{login}")
    public ResponseEntity<?> updateUsuario(@RequestBody Usuario usuario, @PathVariable String login){
        Usuario usuarioActual = null;
        Map<String, Object> response = new HashMap<>();
        usuarioActual = usuarioService.getUsuariosEditar(login);
        if (usuarioActual == null) {
            response.put("mensaje: ", "No exite id".concat(login));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        try {
            usuario.setPassword(utils.Encriptar(usuario.getPassword()));
            usuarioActual.setLogin(usuario.getLogin());
            usuarioActual.setPassword(usuario.getPassword());
            usuarioActual.setNombre(usuario.getNombre());
            usuarioActual.setCliente(usuario.getCliente());
            usuarioActual.setEmail(usuario.getEmail());
            usuarioActual.setFechaalta(usuario.getFechaalta());
            usuarioActual.setFechabaja(usuario.getFechabaja());
            usuarioActual.setStatus(usuario.getStatus());
            usuarioActual.setIntentos(usuario.getIntentos());
            usuarioActual.setFecharevocado(usuario.getFecharevocado());
            usuarioActual.setFechaVigencia(usuario.getFechaVigencia());
            usuarioActual.setNoAcceso(usuario.getNoAcceso());
            usuarioActual.setApellidoPaterno(usuario.getApellidoPaterno());
            usuarioActual.setApellidoMaterno(usuario.getApellidoMaterno());
            usuarioActual.setArea(usuario.getArea());
            usuarioActual.setFechamodificacion(usuario.getFechamodificacion());
            usuarioService.postUsuario(usuarioActual);
        } catch (DataAccessException e) {
            response.put("mensaje: ", "Error el actualizar");
            response.put("error: ", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje: ", "Valor actualizado".concat(login));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/usuarios/{login}")
    public ResponseEntity<?> deleteUsuarios(@PathVariable String login){
        Map<String, Object> response = new HashMap<>();
        try {
            usuarioService.deleteUsuario(login);
        } catch (DataAccessException e) {
            response.put("mensaje: ", "problema con la base de datos".concat(login));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje: ", "Valor eliminado ".concat(login));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
