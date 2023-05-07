package com.example.CL1_VegaBalcazarGabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CL1_VegaBalcazarGabriel.model.Especialidad;



@Repository
public interface EspecialidadRepository extends  JpaRepository<Especialidad, Integer>{

}
