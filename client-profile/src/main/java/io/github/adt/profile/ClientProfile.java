package io.github.adt.profile;

import lombok.Getter;
import lombok.Setter;

import io.github.adt.common.AuditEntity;

@Getter
@Setter
public class ClientProfile extends AuditEntity {
  private String username;
  private String password;
  private String configuration;
}