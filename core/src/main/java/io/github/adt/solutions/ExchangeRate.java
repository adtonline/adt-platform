package io.github.adt.solutions;

import java.math.BigDecimal;
import java.util.Date;

import io.github.adt.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExchangeRate extends BaseEntity {
  private Date date;
  private String fromCurrencyCode;
  private String toCurrencyCode;
  private BigDecimal rate;
  private int precision;
}