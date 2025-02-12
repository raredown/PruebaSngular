package com.sngular.test.domain.repository;

import java.time.LocalDate;
import java.util.List;

import com.sngular.test.domain.Prices;

public interface PricesRepository {
	Prices getById(int priceId )  ;

	Prices save(Prices prices);

	void deleteOPrices(int priceId);

	void deleteAllPrices();

	List<Prices> getAll();

	Prices findBestProduct(LocalDate dateApp, Integer productId, Integer brandId);
}
