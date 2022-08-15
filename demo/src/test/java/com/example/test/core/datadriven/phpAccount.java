package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class phpAccount {
    @DataProvider(name = "dataAddToCard")
    public static Object ddataAddToCard () {
        return JsonHelper.ReadJsonFromFile("src//test//java//com//example//test//core//resources//datas//tkmk.json");       
    };
    @DataProvider(name = "dataAddCard")
    public static Object ddataAddCard () {
        return JsonHelper.ReadJsonFromFile("src//test//java//com//example//test//core//resources//datas//add.json");       
    };
}
