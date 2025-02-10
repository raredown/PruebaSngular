package com.sngular.test.infranstructure.adapter.h2.jpa;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sngular.test.infranstructure.adapter.h2.entity.PricesEntity;
import com.sngular.test.infranstructure.adapter.h2.entity.PricesId;


@Repository
public interface PricesRepository extends JpaRepository<PricesEntity, PricesId>{
	@Query(value = "from PricesEntity prices where prices.brandId = :brandId AND prices.idProduct = :idProduct AND :dateApp BETWEEN prices.startDate AND prices.endDate")
	List<PricesEntity> findBestProduct(@Param("dateApp") LocalDate dateApp,@Param("idProduct") int productId,@Param("brandId") int brandId);
}
