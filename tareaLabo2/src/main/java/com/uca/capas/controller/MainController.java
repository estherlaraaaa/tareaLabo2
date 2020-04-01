package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	private String nombre = "esther";
	private String pass = "123";
	
	
	@GetMapping("/login")
    public String enviarForm(Usuario usuario) {

        return "login";
    }

    @PostMapping("/validacion")
    public String procesarForm(Usuario usuario) {

       if((usuario.getNombre().equals(nombre))&&(usuario.getPass().equals(pass))) {
    	   return "MostrarMensajeV";
       }
       else {
    	   return "MostrarMensajeF";
       }
    
}
}

