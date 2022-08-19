package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataforWhatMyCarWorthTest {
    @DataProvider(name = "dataWhatMyCarWorthTest")
    public static Object ddataAddToCard () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataWhatMyCarWorthTest.json"); 
    };
   
}
