package io.github.adt.profiles;

import lombok.Getter;
import lombok.Setter;

import io.github.adt.common.AuditEntity;

@Getter
@Setter
public class Role extends AuditEntity {
  private String description;
}