package com.dan.cursomc.repositories;


import com.dan.cursomc.domain.Cidade;
import com.dan.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {



}
