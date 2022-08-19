package com.example.test.core.datadriven;
import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataPageTest {
    @DataProvider(name = "dataPageCheck")
    public static Object dataPageCheck () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\datas\\dataPageTest.json");       
    };
}
