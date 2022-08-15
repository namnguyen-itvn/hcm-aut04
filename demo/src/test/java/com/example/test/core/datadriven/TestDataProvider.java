package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;





public class TestDataProvider {
    @DataProvider(name = "WhatsMyCarWorth")
    public static Object whatsMyCarWorth () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\WhatsMyCarWorthPageTestData.json");       
    };
    @DataProvider(name = "OfferOptions")
    public static Object offerOptions () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\OfferOptionsPageTestData.json");       
    };
    @DataProvider(name = "Error Message VIN")
    public static Object errorMessageVin () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\ErrorMessageVinTestData.json");       
    };
    @DataProvider(name = "Error Message Email")
    public static Object errorMessageEmail () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\ErrorMessageEmailTestData.json");       
    };
}