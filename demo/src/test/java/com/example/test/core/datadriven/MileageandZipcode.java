package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;


public class MileageandZipcode {
    

    @DataProvider(name = "MileageandZip")
    public static Object MileageandZipcode () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\resources\\datas\\mileageandzipdata.json");       
    };
}

