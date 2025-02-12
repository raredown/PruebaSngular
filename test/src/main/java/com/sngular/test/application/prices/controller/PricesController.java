package com.sngular.test.application.prices.controller;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sngular.test.application.exception.BadRequestException;
import com.sngular.test.application.exception.InternalServerError;
import com.sngular.test.application.model.prices.PricesRequest;
import com.sngular.test.application.prices.PricesService;
import com.sngular.test.domain.Prices;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/prices")
@RequiredArgsConstructor
public class PricesController{
	private final PricesService pricesService;

	@GetMapping("/")
	public ResponseEntity<Prices> getBestProduct(@PathVariable final LocalDate dateApp,
			@PathVariable final Integer productId, @PathVariable final Integer brandId) {
		Prices result = null;
		try {
			result= pricesService.getBestProduct(dateApp,productId,brandId);
			if (result == null ){
				throw new BadRequestException("dont exixt");
			}
		} catch (Exception e) {
			throw new InternalServerError("internal.server.error");
			}
		return ResponseEntity.ok(result);
	}

}
