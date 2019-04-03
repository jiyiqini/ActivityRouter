package com.thejoyrun.router;

import java.lang.Boolean;
import java.lang.String;

public class ThirdURL extends ActivityHelper {
  public ThirdURL() {
    super("third");
  }

  public ThirdURL formActivity(String formActivity) {
    put("formActivity",formActivity );
    return this;
  }

  public ThirdURL uid(int uid) {
    put("uid",uid );
    return this;
  }

  public ThirdURL age(int age) {
    put("age",age );
    return this;
  }

  public ThirdURL name(String name) {
    put("name",name );
    return this;
  }

  public ThirdURL man(Boolean man) {
    put("man",man );
    return this;
  }

  public ThirdURL manger(Boolean manger) {
    put("manger",manger );
    return this;
  }

  public static ThirdURL builder() {
    return new ThirdURL();
  }
}
