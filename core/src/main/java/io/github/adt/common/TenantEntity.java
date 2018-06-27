package io.github.adt.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TenantEntity extends AuditEntity {
  private int tenantId;
}