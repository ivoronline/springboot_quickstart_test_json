package com.ivoronline.springboot_quickstart_test_json;

import com.fasterxml.jackson.annotation.JsonCreator;

public class RequestDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //SETTERS
  private void setName (String  name) { this.name = "Setter " + name; }
  private void setAge  (Integer age ) { this.age  = age;             }

  //CONSTRUCTOR
  @JsonCreator
  private RequestDTO (
    String  name,
    Integer age
  ) {
    this.name = "Constructor " + name;
    this.age  = age;
  }

}
