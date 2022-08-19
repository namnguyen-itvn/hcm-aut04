package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

<<<<<<< HEAD:demo/src/test/java/com/example/test/core/datadriven/CarResearch.java


public class CarResearch {
    @DataProvider(name = "CarResearch")
    public static Object test1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearch.json");       


    }


=======
public class ShopByPrice {
    @DataProvider(name = "minmaxprice")
    public static Object accountLoginPhp () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resource\\datas\\ShopByPricedata.json");       
    };
>>>>>>> e5a48ada609d6aaef525d48e9a64dcaa0077bdc4:demo/src/test/java/com/example/test/core/datadriven/ShopByPrice.java
}
