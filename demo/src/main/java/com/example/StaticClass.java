package com.example;

public class StaticClass {
    private static class inner{
      private  static final StaticClass obj=new StaticClass();
    }
    private StaticClass(){}
    public static final StaticClass getInstance(){
        return inner.obj;
    }
}
