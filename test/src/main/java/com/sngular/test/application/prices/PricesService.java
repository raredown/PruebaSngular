package com.sngular.test.application.prices;

import java.time.LocalDate;
import java.util.List;

import com.sngular.test.application.model.prices.PricesRequest;
import com.sngular.test.domain.Prices;

public interface PricesService {

	Prices getBestProduct(LocalDate dateApp, Integer productId, Integer brandId);
}
