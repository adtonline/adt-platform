package io.github.adt.solutions;

import java.math.BigDecimal;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Recipient extends TenantEntity {
  private BigDecimal amount;
  private String currency;
}