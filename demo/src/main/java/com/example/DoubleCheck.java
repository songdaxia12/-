package com.example;

public class DoubleCheck {
    private DoubleCheck(){}
    private static DoubleCheck obj;
    public static DoubleCheck getInstance(){
        if(obj==null){
            synchronized(DoubleCheck.class){
                if(obj==null){
                    obj=new DoubleCheck();
                }
            }
        }
        return obj;
    }
}
