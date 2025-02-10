package com.sngular.test.application.prices;

import org.springframework.stereotype.Service;

import com.sngular.test.application.model.prices.Prices;
import com.sngular.test.application.model.prices.PricesRequest;
import com.sngular.test.infranstructure.adapter.h2.entity.PricesEntity;
import com.sngular.test.infranstructure.adapter.h2.jpa.PricesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PricesServiceImpl implements  PricesService{
	private final PricesRepository pricesRepository;
	@Override
	public Prices getBestProduct(PricesRequest pricesRequest) {
		
		PricesEntity priceEntity= pricesRepository.findBestProduct(pricesRequest.getDateApp(), pricesRequest.getProductId(), pricesRequest.getBrandId()).get(0);
		return Prices.fromModel(priceEntity);
	}

}
