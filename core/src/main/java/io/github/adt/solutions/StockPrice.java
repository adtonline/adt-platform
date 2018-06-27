package io.github.adt.solutions;

import java.util.Date;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockPrice extends TenantEntity {
  private long instrumentId;
  private String symbol;
  private Date date;
  private double open;
  private double close;
  private double low;
  private double high;
  private long volume;
}