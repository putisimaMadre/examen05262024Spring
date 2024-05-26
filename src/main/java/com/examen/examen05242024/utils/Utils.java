package com.examen.examen05242024.utils;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Utils {
    public String Encriptar(String password){
        byte[] passwordBytes = password.getBytes();
        return Base64.getEncoder().encodeToString(passwordBytes);
    }

    public String Desencriptar(String encriptado){
        byte[] passwordBytes = Base64.getDecoder().decode(encriptado);
        String desencriptado = new String(passwordBytes);
        return desencriptado;
    }
}
