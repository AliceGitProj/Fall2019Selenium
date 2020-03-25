package com.automation.utilities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverTest {
    @Test
    public void googleTest(){
        Driver.getDriver().get("http://google.com");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Google");
        Driver.closeDriver();
    }
}
