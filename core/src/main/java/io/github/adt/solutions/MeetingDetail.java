package io.github.adt.solutions;

import lombok.Getter;
import lombok.Setter;

import io.github.adt.common.TenantEntity;

@Getter
@Setter
public class MeetingDetail extends TenantEntity {
  private String creator;
  private String requestor;
  private String agenda;
  private String notes;
  private String minutes;
}