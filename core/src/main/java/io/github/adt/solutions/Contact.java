package io.github.adt.solutions;

import java.sql.Date;

import io.github.adt.common.TenantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Contact extends TenantEntity {
  private String firstName;
  private String middleName;
  private String lastName;
  private String username;
  private String salutation;
  private Date dob;
  private boolean gender;
  private String phone;
  private String email;
  private String postalCode;
  private String address1;
  private String address2;
  private String city;
  private String province;
  private String state;
  private String country;
}