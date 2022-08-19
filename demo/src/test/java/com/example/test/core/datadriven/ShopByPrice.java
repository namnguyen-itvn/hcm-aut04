package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class ShopByPrice {
    @DataProvider(name = "minmaxprice")
    public static Object accountLoginPhp () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resource\\datas\\ShopByPricedata.json");       
    };
}
