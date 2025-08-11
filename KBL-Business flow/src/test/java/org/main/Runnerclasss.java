package org.main;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.steps",tags="@test2",
                 monochrome=true,dryRun=false,
         plugin= {"pretty","json:target\\Cucumber-Reports\\Petit.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runnerclasss {

	@AfterClass
	public static void JvmReport() {
		Jvmreports.generateJVM(System.getProperty("user.dir")+"\\target\\Cucumber-Reports\\Petit.json");
		  	
	}
	
	
	
}
