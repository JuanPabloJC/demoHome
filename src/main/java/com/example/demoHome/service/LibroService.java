package com.example.demoHome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoHome.model.Libro;
import com.example.demoHome.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    private List<Libro> readAll(){
        return libroRepository.obteneLibros();
    }
}
