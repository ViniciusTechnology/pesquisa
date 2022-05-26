package com.devsuperior.pesquisa.repositories;

import com.devsuperior.pesquisa.entities.Genre;
import com.devsuperior.pesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository <Record, Long> {
}
