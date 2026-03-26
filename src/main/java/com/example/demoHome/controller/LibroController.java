package com.example.demoHome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoHome.model.Libro;
import com.example.demoHome.service.LibroService;

@RestController
@RequestMapping("api/v1/libros")

public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> readAll(){
        return libroService.readAll();
    }    

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){
        libroService.save(libro);
        return libro;
    }
}
