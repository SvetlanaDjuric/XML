package com.firma.services;

import java.util.List;

import com.firma.models.domain.NalogZaPrenosDTO;

public interface NalogZaPrenosService {

	public NalogZaPrenosDTO findOne(Long id);

	public NalogZaPrenosDTO save(NalogZaPrenosDTO nalogZaPrenos);

	public List<NalogZaPrenosDTO> find();

}
