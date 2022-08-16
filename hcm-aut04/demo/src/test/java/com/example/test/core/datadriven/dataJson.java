package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataJson {
    @DataProvider(name = "dataCategoryAndStyle")
    public static Object dataCategoryAndStyle () {
        return JsonHelper.ReadJsonFromFile("/Users/dawnpok/hcm-aut04/demo/src/test/java/com/example/test/core/resources/datas/datas.json");       
    };
}
 
