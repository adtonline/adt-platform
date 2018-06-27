package io.github.adt.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataModel extends TenantEntity {
  private String code;
  private String name;
  private String type;
  private String status;
  private String desc;
  private long parentId;
  private long categoryId;
  private String externalId;
}