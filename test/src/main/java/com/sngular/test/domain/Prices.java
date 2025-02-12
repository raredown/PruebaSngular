package com.sngular.test.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Prices(int pricesId, int brandId, LocalDate startDate, LocalDate endDate, int priceList, String partNumber, int priority, BigDecimal price, String curr) {

	public static final class Builder {

		private final int pricesId;

		private final int brandId;

		private LocalDate startDate;

		private LocalDate endDate;

		private int priceList;

		private String partNumber;

		private int priority;

		private BigDecimal price;

		private String curr;

		public Builder(final int pricesId, final int brandId) {
			this.pricesId = pricesId;
			this.brandId = brandId;
		}

		public Builder startDate(final LocalDate startDate) {
			this.startDate = startDate;
			return this;
		}

		public Builder endDate(final LocalDate endDate) {
			this.endDate = endDate;
			return this;
		}

		public Builder priceList(final int priceList) {
			this.priceList = priceList;
			return this;
		}

		public Builder partNumber(final String partNumber) {
			this.partNumber = partNumber;
			return this;
		}

		public Builder priority(final int priority) {
			this.priority = priority;
			return this;
		}

		public Builder price(final BigDecimal price) {
			this.price = price;
			return this;
		}

		public Builder curr(final String curr) {
			this.curr = curr;
			return this;
		}

		public Prices build() {
			return new Prices(pricesId, brandId, startDate, endDate, priceList, partNumber, priority, price, curr);
		}
	}
}
