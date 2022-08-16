package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;





public class TestDataProvider {
    @DataProvider(name = "WhatsMyCarWorth")
    public static Object whatsMyCarWorth () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\WhatsMyCarWorthPageTestData.json");       
    };
}