package com.sngular.test.infranstructure.adapter.h2.entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PricesId implements Serializable{
	
	private int brandId;
	private LocalDate starDate;
	private LocalDate endDate;

}
