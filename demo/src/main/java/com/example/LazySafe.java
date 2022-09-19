package com.example;

public class LazySafe {
    private LazySafe(){}
    private static LazySafe obj;
    public static synchronized LazySafe getInstance(){
        if(obj==null){
            obj=new LazySafe();
        }
        return obj;
    }
}
