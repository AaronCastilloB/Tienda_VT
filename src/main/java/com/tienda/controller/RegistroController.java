package com.tienda.controller;

import com.tienda.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @GetMapping("/nuevo")
    public String nuevo(Model model, Usuario usuario) {

        return "/registro/nuevo";
    }

    @PostMapping("/registro/crear")
    public String crear(Model model, Usuario usuario) {

        model.addAttribute("titulo", usuario.getUsername());
        model.addAttribute("mensaje", "Revise su cuenta de correo, se envió un mensaje de activación.");

        return "/registro/salida";
    }
}
