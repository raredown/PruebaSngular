package com.sngular.test.application.model.prices;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PricesRequest {
	private LocalDate dateApp;
	private int productId;
	private int brandId;
}
