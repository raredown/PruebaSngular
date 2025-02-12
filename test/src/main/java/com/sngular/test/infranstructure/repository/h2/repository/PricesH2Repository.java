package com.sngular.test.infranstructure.repository.h2.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.sngular.test.infranstructure.repository.h2.repository.model.PricesEntity;

@Repository
public interface PricesH2Repository extends ListCrudRepository<PricesEntity, Integer>{

	@Query(
			value = "SELECT * FROM PRICES  where BRAND_ID = :brandId AND ID_PRODUCT = :productId AND :dateApp BETWEEN START_DATE AND END_DATE",
			nativeQuery = true)
	List<PricesEntity>  findBestProduct(LocalDate dateApp, Integer productId, Integer brandId);
}
