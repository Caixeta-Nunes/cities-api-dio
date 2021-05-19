package com.willian.citiesapi.states.respository;

import com.willian.citiesapi.states.entity.State;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}