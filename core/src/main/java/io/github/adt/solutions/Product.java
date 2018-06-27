package io.github.adt.solutions;

import io.github.adt.common.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product extends Category {
  private long companyId;
  private String externalId;
  private String countryCode;
}