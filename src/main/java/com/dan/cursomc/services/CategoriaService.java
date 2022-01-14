package com.dan.cursomc.services;

import com.dan.cursomc.domain.Categoria;
import com.dan.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return  obj.orElseThrow(()-> new RuntimeException("id não encontrado"));
    }

}
