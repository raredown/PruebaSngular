package com.sngular.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sngular.test.domain.Prices;
import com.sngular.test.domain.repository.PricesRepository;

@SpringBootTest
class PrinceRequestTests {
	@Autowired
	private PricesRepository pricesRepository;
	@Test
	void testOne() {
		Prices priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 10:00"), 35455, 1);
		assertThat(priceEntity.pricesId()).isEqualTo(1);
	}

	@Test
	void testTwo() {
		Prices priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 16:00"), 35455, 1);
		assertThat(priceEntity.pricesId()).isEqualTo(2);
	}
	@Test
	void testTree() {
		Prices priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-14 21:00"), 35455, 1);
		assertThat(priceEntity.pricesId()).isEqualTo(3);
	}	
	@Test
	void testFour() {
		Prices priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-15 10:00"), 35455, 1);
		assertThat(priceEntity.pricesId()).isEqualTo(4);
	}	
	@Test
	void testFive() {
		Prices priceEntity= pricesRepository.findBestProduct(LocalDate.parse("2020-06-16 21:00"), 35455, 1);
		assertThat(priceEntity.pricesId()).isEqualTo(5);
	}	

}