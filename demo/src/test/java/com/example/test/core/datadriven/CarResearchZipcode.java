package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class CarResearchZipcode {
    @DataProvider(name = "CarResearchZipcode")
    public static Object CarResearchZipcode() {
        return JsonHelper
                .ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearchZipcode.json");
    };
}
