package io.github.adt.solutions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee extends Contact {
  private String title;
  private String businessCode;
  private String department;
}