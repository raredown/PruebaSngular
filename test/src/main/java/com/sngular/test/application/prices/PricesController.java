package com.sngular.test.application.prices;

import org.springframework.http.ResponseEntity;

import com.sngular.test.application.model.prices.Prices;
import com.sngular.test.application.model.prices.PricesRequest;



public interface PricesController {
	ResponseEntity<Prices> getBestProduct(PricesRequest pricesRequest);

}
