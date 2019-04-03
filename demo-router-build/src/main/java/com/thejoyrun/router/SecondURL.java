package com.thejoyrun.router;

import java.lang.Boolean;
import java.lang.String;

public class SecondURL extends ActivityHelper {
  public SecondURL() {
    super("second");
  }

  public SecondURL formActivity(String formActivity) {
    put("formActivity",formActivity );
    return this;
  }

  public SecondURL uid(int uid) {
    put("uid",uid );
    return this;
  }

  public SecondURL age(int age) {
    put("age",age );
    return this;
  }

  public SecondURL name(String name) {
    put("name",name );
    return this;
  }

  public SecondURL man(Boolean man) {
    put("man",man );
    return this;
  }

  public SecondURL manger(Boolean manger) {
    put("manger",manger );
    return this;
  }

  public static SecondURL builder() {
    return new SecondURL();
  }
}
