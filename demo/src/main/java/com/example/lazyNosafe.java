package com.example;

public class lazyNosafe {
    public static lazyNosafe obj;
    private lazyNosafe(){}
    public static lazyNosafe getInstance(){
        if(obj!=null){
            return obj;
        }else{
            obj=new lazyNosafe();
            return obj;
        }
    }
}
