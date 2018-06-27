package io.github.adt.solutions;

import java.util.Date;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Event extends TenantEntity {
  private Date startDate;
  private Date endDate;
}