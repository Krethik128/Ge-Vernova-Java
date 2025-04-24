package com.gevernova.generics.smartWareHouse;
import java.util.*;
class WarehouseUtils {
    public static void displayItems(List< ? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}

