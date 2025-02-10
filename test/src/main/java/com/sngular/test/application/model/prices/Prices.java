package com.sngular.test.application.model.prices;

import java.time.LocalDate;

import com.sngular.test.infranstructure.adapter.h2.entity.PricesEntity;

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
public class Prices {

	private int brandId;
	private int priceList;
	private LocalDate dateApp;
	private int productId;
	private float price;

	public static Prices fromModel(PricesEntity pricesEntity) {
		if (pricesEntity == null)
			return null;
		return Prices.builder().brandId(pricesEntity.getBrandId())
				.price(pricesEntity.getPrice())
				.priceList(pricesEntity.getPriceList())
				.productId(pricesEntity.getProductId()).build();
	}
}
