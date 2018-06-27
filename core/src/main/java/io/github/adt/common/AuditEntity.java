package io.github.adt.common;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuditEntity extends BaseEntity {
  private int version;
  private String createdBy;
  private Date createdAt;
  private String updatedBy;
  private Date updatedAt;
}