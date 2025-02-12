package com.sngular.test.application.prices.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sngular.test.application.model.prices.PricesRequest;
import com.sngular.test.application.prices.PricesService;
import com.sngular.test.domain.Prices;
import com.sngular.test.domain.repository.PricesRepository;
import com.sngular.test.infranstructure.repository.h2.repository.model.PricesEntity;

import lombok.RequiredArgsConstructor;

@Service
public class PricesServiceImpl implements  PricesService{
	private final PricesRepository pricesRepository;
	
	public PricesServiceImpl(final PricesRepository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}

	@Override
	public Prices getBestProduct(LocalDate dateApp, Integer productId, Integer brandId) {
		return pricesRepository.findBestProduct( dateApp,  productId,  brandId);
	}


}
