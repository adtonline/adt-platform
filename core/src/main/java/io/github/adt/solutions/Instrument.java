package io.github.adt.solutions;

import java.util.Date;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Instrument extends TenantEntity {
  private long companyId;
  private String currencyCode;
  private String mic;
  private String isin;
  private String ticker;
  private long exchangeId;
  private Date startDate;
  private Date endDate;
}