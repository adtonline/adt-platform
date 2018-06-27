package io.github.adt.solutions;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Expense extends TenantEntity {
  private Date expenseDate;
  private Date paidDate;
  private BigDecimal amount;
  private String currency;
  private String description;
  private long activityId;
  private long purposeId;
  private long productId;
  private List<Recipient> recipients;
  private Event event;
}