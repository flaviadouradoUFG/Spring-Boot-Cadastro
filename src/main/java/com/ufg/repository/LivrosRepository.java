package com.ufg.repository;

import com.ufg.model.Aluno;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivrosRepository extends PagingAndSortingRepository<Aluno, Long> {

    List<Aluno> findByNome(@Param("nome") String nome_aluno);

}