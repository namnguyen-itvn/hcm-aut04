package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;


public class TestDataProvider {
    @DataProvider(name = "OfferOptions")
    public static Object offerOptions () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\test\\core\\resources\\datas\\OfferOptionsPageTestData.json");       
    };
    
}