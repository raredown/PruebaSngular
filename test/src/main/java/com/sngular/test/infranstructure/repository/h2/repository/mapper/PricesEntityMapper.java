package com.sngular.test.infranstructure.repository.h2.repository.mapper;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sngular.test.domain.Prices;
import com.sngular.test.infranstructure.repository.h2.repository.model.PricesEntity;

@Component
public class PricesEntityMapper {

	public final Prices fromValue(final PricesEntity pricesEntity) {
		return new Prices
				.Builder(pricesEntity.getId(), pricesEntity.getBrandId())
				.curr(pricesEntity.getCurr())
				.priceList(pricesEntity.getPriceList())
				.price(pricesEntity.getPrice())
				.priority(pricesEntity.getPriority())
				.startDate(pricesEntity.getStarDate())
				.endDate(pricesEntity.getEndDate())
				.build();
	}

	public final PricesEntity toValue(final Prices price) {
		return new PricesEntity
				.Builder(price.pricesId(), price.brandId())
				.curr(price.curr())
				.priceList(price.priceList())
				.price(price.price())
				.priority(price.priority())
				.startDate(price.startDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH.mm.ss")))
				.endDate(price.endDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH.mm.ss")))
				.build();
	}

	public final List<Prices> fromValueList(final List<PricesEntity> pricesEntityList) {
		final var pricesList = new ArrayList<Prices>(pricesEntityList.size());

		for (var pricesEntity : pricesEntityList) {
			pricesList.add(fromValue(pricesEntity));
		}
		return pricesList;
	}
}
