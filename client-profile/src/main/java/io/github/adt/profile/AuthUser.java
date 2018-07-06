package io.github.adt.profile;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import io.github.adt.common.TenantEntity;

@Getter
@Setter
public class AuthUser extends TenantEntity {
  private String title;
  private String email;
  private String username;
  private String password;
  private List<Long> roles;
  private List<Long> groups;
  private boolean lockFlag;
  private boolean deleteFlag;
}