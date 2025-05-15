package com.gevernova.annotations;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("old message");
    }
    public void newFeature(){
        System.out.println("new feature");
    }
}
