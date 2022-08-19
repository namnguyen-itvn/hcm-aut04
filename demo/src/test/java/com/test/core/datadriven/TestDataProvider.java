package com.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.test.core.helper.JsonHelper;


public class TestDataProvider {
    @DataProvider(name = "OfferOptions")
    public static Object offerOptions () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\test\\core\\resources\\datas\\OfferOptionsPageTestData.json");       
    };
    
}