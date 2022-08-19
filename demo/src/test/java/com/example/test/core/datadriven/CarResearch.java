package com.example.test.core.datadriven;
import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;



public class CarResearch {
    @DataProvider(name = "CarResearch")
    public static Object test1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearch.json");       


    }


}