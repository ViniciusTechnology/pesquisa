package com.devsuperior.pesquisa.repositories;

import com.devsuperior.pesquisa.entities.Game;
import com.devsuperior.pesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {
}
