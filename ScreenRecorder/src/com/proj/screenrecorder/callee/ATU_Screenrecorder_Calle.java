package com.proj.screenrecorder.callee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.proj.screenrecorder.ScreenRecorder_ATU;

public class ATU_Screenrecorder_Calle {

	@Test
	public static void TestScreenrecorder() throws Exception {
		
		ScreenRecorder_ATU.startRecorder();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://qa.haicpm.com/");
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("strUserLogin")).sendKeys("snallamothu@hostanalytics.com");
		driver.findElement(By.id("strUserPwd")).sendKeys("satish$123456");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		ScreenRecorder_ATU.stopRecorder();	
		}

}
