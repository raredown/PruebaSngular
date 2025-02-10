package com.sngular.test.infranstructure.adapter.h2.entity;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(PricesId.class)
@Table(name = "PRICES")
public class PricesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="BRAND_ID")
	private int brandId;
	@Column(name="START_DATE")
	private LocalDate starDate;
	@Column(name="END_DATE")
	private LocalDate endDate;
	@Column(name="PRICE_LIST")
	private int priceList;
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PRIORITY")
	private int priority;
	@Column(name="PRICE")
	private float price;
	@Column(name="CURR")
	private String curr;
}
