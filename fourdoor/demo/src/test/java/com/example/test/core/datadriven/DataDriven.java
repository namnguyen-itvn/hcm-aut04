package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class DataDriven {
    @DataProvider(name = "TestCase22")
    public static Object TestCase1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\testCase22.json");       
    }

    @DataProvider(name = "TestCase23")
    public static Object TestCase2 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\testCase23.json");       
    }
}
