package com.example.CL1_VegaBalcazarGabriel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {
	@Id
	private Integer idesp;
	@Column(name = "nomesp")
	private String nomesp ;
	@Column(name = "costo")
	private Double costo;
	
	
}
