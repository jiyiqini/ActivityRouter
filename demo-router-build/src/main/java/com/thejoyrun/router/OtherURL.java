package com.thejoyrun.router;

import java.lang.String;

public class OtherURL extends ActivityHelper {
  public OtherURL() {
    super("other");
  }

  public OtherURL name(String name) {
    put("name",name );
    return this;
  }

  public OtherURL age(int age) {
    put("age",age );
    return this;
  }

  public OtherURL id(int id) {
    put("id",id );
    return this;
  }

  public static OtherURL builder() {
    return new OtherURL();
  }
}
