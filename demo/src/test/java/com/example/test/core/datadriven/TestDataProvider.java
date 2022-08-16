package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class TestDataProvider {
    @DataProvider(name = "dataErrorMessageVIN")
    public static Object errorMessageVIN () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataErrorMessageVIN.json");       
    };

    @DataProvider(name = "dataErrorMessageEmail")
    public static Object errorMessageEmail () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataErrorMessageEmail.json");       
    };
}
