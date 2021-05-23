package com.willian.citiesapi.countries.repositories;

import com.willian.citiesapi.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
