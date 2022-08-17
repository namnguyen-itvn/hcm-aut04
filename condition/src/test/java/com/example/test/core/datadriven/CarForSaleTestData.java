package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class CarForSaleTestData {

    @DataProvider(name = "optionCondition")
    public static Object[][] dataTest() {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\conditiondata.json");
    } 

    @DataProvider(name="yearDataForTest")
    public static Object[][] dataYearTest() {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\yeardata.json");
    }
    @DataProvider(name="expectedYearData")
    public static Object[][] expectedYearData() {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\expectedyeardata.json");
    }

}
