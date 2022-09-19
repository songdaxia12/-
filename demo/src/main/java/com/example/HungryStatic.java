package com.example;

public class HungryStatic {
    
    private static final HungryStatic hugrstatic=new HungryStatic();
    private HungryStatic(){}
    public static HungryStatic getInstance(){
        return hugrstatic;
    }
    
}
