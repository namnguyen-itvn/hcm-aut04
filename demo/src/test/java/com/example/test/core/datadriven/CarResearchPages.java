package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class CarResearchPages {
    @DataProvider(name = "CarResearchPages")
    public static Object test1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearchPages.json");       
    };

}
