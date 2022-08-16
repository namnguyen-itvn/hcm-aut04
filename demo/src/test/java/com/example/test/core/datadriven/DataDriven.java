package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class DataDriven {
    @DataProvider(name = "dataDetailsCarDelivery")
    public static Object dataDetailsCarDelivery() {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataDetailsCarDelivery.json");  
    };
    @DataProvider(name = "dataCarDetailsForSale")
    public static Object dataCarDetailsForSale() {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataCarDetailsForSale.json");  
    };
}
