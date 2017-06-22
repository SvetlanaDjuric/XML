package com.firma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firma.models.domain.NalogZaPrenosDTO;

@Repository
public interface NalogZaPrenosRepository extends JpaRepository<NalogZaPrenosDTO, Long> {

}
