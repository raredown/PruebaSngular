package com.sngular.test.infranstructure.repository.h2.repository.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.sngular.test.domain.Prices;
import com.sngular.test.domain.Prices.Builder;
import com.sngular.test.infranstructure.adapter.h2.entity.PricesId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRICES")
public class PricesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="BRAND_ID")
	private int brandId;
	@Column(name="START_DATE")
	private LocalDate starDate;
	@Column(name="END_DATE")
	private LocalDate endDate;
	@Column(name="PRICE_LIST")
	private int priceList;
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PRIORITY")
	private int priority;
	@Column(name="PRICE")
	private BigDecimal price;
	@Column(name="CURR")
	private String curr;



	public PricesEntity(int id2, int brandId2, String startDate, String endDate2, int priceList2, int priority2,
			BigDecimal price2, String curr2) {
		this.id = id;
		this.brandId = brandId;
		this.starDate = starDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}


	public static final class Builder {

		private final int id;

		private final int brandId;

		private String startDate;

		private String endDate;

		private int priceList;

		private int priority;

		private BigDecimal price;

		private String curr;

		public Builder(final int id, final int brandId) {
			this.id = id;
			this.brandId = brandId;
		}

	    public Builder startDate(final String startDate) {
	        this.startDate = startDate;
	        return this;
	      }

	      public Builder endDate(final String endDate) {
	        this.endDate = endDate;
	        return this;
	      }

		public Builder priceList(final int priceList) {
			this.priceList = priceList;
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
		  public PricesEntity build() {
		      return new PricesEntity(id, brandId, startDate, endDate, priceList, priority, price, curr);
		    }

	}

}
