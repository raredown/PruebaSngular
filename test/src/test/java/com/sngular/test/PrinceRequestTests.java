package com.sngular.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sngular.test.infranstructure.adapter.h2.entity.PricesEntity;
import com.sngular.test.infranstructure.adapter.h2.jpa.PricesRepository;

@SpringBootTest
class PrinceRequestTests {
	@Autowired
	private PricesRepository pricesRepository;
	@Test
	void testOne() {
		PricesEntity priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 10:00"), 35455, 1).get(0);
		assertThat(priceEntity.getId()).isEqualTo(1);
	}

	@Test
	void testTwo() {
		PricesEntity priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 16:00"), 35455, 1).get(0);
		assertThat(priceEntity.getId()).isEqualTo(2);
	}
	@Test
	void testTree() {
		PricesEntity priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 21:00"), 35455, 1).get(0);
		assertThat(priceEntity.getId()).isEqualTo(3);
	}	
	@Test
	void testFour() {
		PricesEntity priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-15 10:00"), 35455, 1).get(0);
		assertThat(priceEntity.getId()).isEqualTo(4);
	}	
	@Test
	void testFive() {
		PricesEntity priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-16 21:00"), 35455, 1).get(0);
		assertThat(priceEntity.getId()).isEqualTo(5);
	}	

}