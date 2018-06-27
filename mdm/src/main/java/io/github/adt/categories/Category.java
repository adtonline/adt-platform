package io.github.adt.categories;

import java.util.Date;

import io.github.adt.common.DataModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Category extends DataModel {
  private String values;
  private Date effectiveDate;
  private Date expirationDate;
}