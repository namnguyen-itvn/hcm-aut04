package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataJson {
    @DataProvider(name = "dataCategoryAndStyle")
    public static Object dataCategoryAndStyle () {
        return JsonHelper.ReadJsonFromFile("src//test//java//com//example//test//core//resources//datas//datas.json");       
    };
}
 
