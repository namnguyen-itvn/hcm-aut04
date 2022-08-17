package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class DataDriven {
 
    
    @DataProvider(name = "ZipCode")
    public static Object ZipCode () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\ZipCode.json");       
    };

}
