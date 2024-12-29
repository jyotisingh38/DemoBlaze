package com.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{

	public static void getScreenshot(WebDriver driver,String name)
	{

		TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	/*
	File dest=new File(System.getProperty("user.dir")+"/src/test/screenshot/"+name+System.currentTimeMillis()+".png");
	try {
		FileHandler.copy(temp,dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/
		// Define the directory where screenshots should be saved
        String screenshotDir = System.getProperty("user.dir") + "/src/test/screenshot/";

        // Create the destination file path
        File dest = new File(screenshotDir + name + System.currentTimeMillis() + ".png");
        
        try {
            // Ensure the directory exists
            File directory = new File(screenshotDir);
            if (!directory.exists()) {
                directory.mkdirs();  // Create the directory if it doesn't exist
            }

            // Copy the screenshot to the destination
            FileHandler.copy(temp, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
