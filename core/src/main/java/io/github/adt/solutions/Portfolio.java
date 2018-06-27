package io.github.adt.solutions;

import java.math.BigDecimal;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Portfolio extends TenantEntity {
  private String owner;
  private String currencyCode;
  private String countryCode;
  private BigDecimal assets;
  private BigDecimal liabilities;
  private BigDecimal netWorthValues;
  private String riskLevel;
  private String segment;
}