package com.sngular.test.infranstructure.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sngular.test.application.exception.NotFoundException;
import com.sngular.test.domain.Prices;
import com.sngular.test.domain.repository.PricesRepository;
import com.sngular.test.infranstructure.repository.h2.repository.PricesH2Repository;
import com.sngular.test.infranstructure.repository.h2.repository.mapper.PricesEntityMapper;

@Repository
public class H2PricesRepository implements PricesRepository {
	
	 private final PricesH2Repository repository;
	 
	 private final PricesEntityMapper mapper;


	public H2PricesRepository(final PricesH2Repository repository, final PricesEntityMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}


	@Override
	public Prices getById(int priceId) {
	    return mapper.fromValue(repository.findById(priceId).orElseThrow(() -> new NotFoundException("No se ha encontrado "+priceId)));

	}

	@Override
	public Prices save(Prices prices) {
	    return mapper.fromValue(repository.save(mapper.toValue(prices)));

	}

	@Override
	public void deleteOPrices(int priceId) {
		repository.deleteById(priceId);		
	}


	@Override
	public void deleteAllPrices() {
		repository.deleteAll();
	}

	@Override
	public List<Prices> getAll() {
		 return mapper.fromValueList(repository.findAll());
	}


	@Override
	public Prices findBestProduct(LocalDate dateApp, Integer productId, Integer brandId) {
		repository.findBestProduct( dateApp,  productId,  brandId) ;
		return mapper.fromValue(repository.findBestProduct( dateApp,  productId,  brandId).get(0));
	}


}
