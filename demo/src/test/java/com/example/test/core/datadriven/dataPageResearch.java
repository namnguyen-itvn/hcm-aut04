package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataPageResearch {
    @DataProvider(name = "dataPageTest")
    public static Object dataPageTest() {
        return JsonHelper
                .ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataPageTest.json");
    }
};
