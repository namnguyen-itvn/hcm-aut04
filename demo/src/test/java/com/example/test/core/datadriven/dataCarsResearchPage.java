package com.example.test.core.datadriven;

import org.testng.annotations.DataProvider;

import com.example.test.core.helper.JsonHelper;

public class dataCarsResearchPage {
    @DataProvider(name = "dataCarsResearchPage")
    public static Object dataCarsResearchPages() {
        return JsonHelper
                .ReadJsonFromFile("src\\test\\java\\com\\example\\test\\core\\resources\\datas\\dataCarsResearchPage.json");
    }
};
