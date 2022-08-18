package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class DatawhatMyCarWorth {

    @DataProvider(name = "dataVerifyVIN")
    public static Object ddataVerifyVIN () {
        return JsonHelper.ReadJsonFromFile("src//test//java//com//example//test//core//resources//datas//DataVerifyVIN.json");       
    }
    
    @DataProvider(name = "dataVerifyChangeMileage")
    public static Object dataVerifyChangeMileage () {
        return JsonHelper.ReadJsonFromFile("src//test//java//com//example//test//core//resources//datas//DataVerifyChangeMileage.json");       
    }
}
