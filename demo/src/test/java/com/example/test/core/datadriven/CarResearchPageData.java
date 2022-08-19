package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class CarResearchPageData {
    @DataProvider(name = "CarResearchPageData")
    public static Object CarResearchPageData () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearchPageData.json");       
    };
}
