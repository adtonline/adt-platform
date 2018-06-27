package io.github.adt.profiles;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import io.github.adt.common.AuditEntity;

@Getter
@Setter
public class Group extends AuditEntity {
  private String description;
  private List<Long> parentGroups;
  private List<Long> roles;
}