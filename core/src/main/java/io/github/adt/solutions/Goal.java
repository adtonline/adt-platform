package io.github.adt.solutions;

import java.math.BigDecimal;
import java.util.Date;

import io.github.adt.common.DataModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Goal extends DataModel {
  private Date startDate;
  private Date endDate;
  private BigDecimal target;
  private BigDecimal investment;
  private BigDecimal shortfall;
}