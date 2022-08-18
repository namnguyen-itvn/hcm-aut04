package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class CarResearchZipCode {
    @DataProvider(name = "inputzipcode")
    public static Object inputzipcode () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\zipcode.json");       
    };
}
