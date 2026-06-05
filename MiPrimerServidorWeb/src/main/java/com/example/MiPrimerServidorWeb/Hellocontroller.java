package com.example.MiPrimerServidorWeb;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Hellocontroller {
    @GetMapping("/hello")
    public String hello(){
        return "Hola desde mi controlador Spring Boot";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola " + nombre +  " este es mi servidor de aplicacion";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibi tu mensaje " + mensaje;
    }
}
