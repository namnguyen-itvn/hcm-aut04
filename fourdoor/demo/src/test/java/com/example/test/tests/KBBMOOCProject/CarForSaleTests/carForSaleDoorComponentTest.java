package com.example.test.tests.KBBMOOCProject.CarForSaleTests;
import com.example.test.core.datadriven.Door;
import com.example.test.pages.KBBMOOCProject.carForSaleDoorComponent;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class carForSaleDoorComponentTest extends KbbBaseTest{
    @Test(testName ="Verify Car Models For Sale Which Have 4 Doors Should Be Displayed When User Choose Filter With Door Type As User's Intention",dataProviderClass= Door.class,dataProvider ="FourDoor")
    public void verifyCarModelsForSaleWhichHave4DoorsShouldBeDisplayedWhenUserChooseFilterWithDoorTypeAsUsersIntention (String fourdoor,String title) throws InterruptedException
    { 
        carForSaleDoorComponent carForSaleDoor = new carForSaleDoorComponent(driver);
        carForSaleDoor.checkTitlePage();
        carForSaleDoor.clickDoorFilter();
        Assert.assertTrue(carForSaleDoor.chekDoorsFilterAfterClick(),"Filter Is Not Displayed");
        carForSaleDoor.clickCheckBoxFourDoor();
        carForSaleDoor.checkCheckBoxFourDoorIsSelected();
        Assert.assertTrue(carForSaleDoor.checkTextFourDoor(fourdoor), "The Car Four Door Is Not Displayed");

       
        
    }
    
}
