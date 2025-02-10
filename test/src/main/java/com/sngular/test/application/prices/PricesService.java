package com.sngular.test.application.prices;

import com.sngular.test.application.model.prices.Prices;
import com.sngular.test.application.model.prices.PricesRequest;

public interface PricesService {

	Prices getBestProduct(PricesRequest pricesRequest);
}
