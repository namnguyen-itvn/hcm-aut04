package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

<<<<<<< HEAD:demo/src/test/java/com/example/test/core/datadriven/CarResearchPages.java
public class CarResearchPages {
    @DataProvider(name = "CarResearchPages")
    public static Object Test1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearchPages.json");       
=======

public class CarResearch {
    @DataProvider(name = "CarResearch")
    public static Object test1 () {
        return JsonHelper.ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\CarResearch.json");       


>>>>>>> develop:demo/src/test/java/com/example/test/core/datadriven/CarResearch.java
    };


}
