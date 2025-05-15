package com.gevernova.annotations;

import java.util.ArrayList;

public class RawListDemo {
    @SuppressWarnings("unchecked")
    public void demoRawList() {
        ArrayList rawList=new ArrayList();
        rawList.add("Hello");
        rawList.add(123); // Mixed types
        System.out.println("Raw List Contents: " + rawList);
    }
}
