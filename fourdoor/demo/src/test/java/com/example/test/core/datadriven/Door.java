package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class Door {

    @DataProvider(name = "FourDoor")
    public static Object TestCase2 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\fourDoor.json");       
    }
}
