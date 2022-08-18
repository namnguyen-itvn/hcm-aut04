package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class PriceRating {
    @DataProvider(name = "GoodPrice")
    public static Object TestCase1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\goodPrice.json");       
    }

   
}
