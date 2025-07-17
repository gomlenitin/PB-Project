package org.steps;

import java.io.IOException;


import org.base.Ultilityclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pom.BinisinaPom;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class BinHooks extends Ultilityclass {
	

	System.out.println("Entry");
	@Before
	public void Start() {

		launchBrowser(1);
		launchurl("https://mcstaging.binsina.ae");
		pagemaximize();
	   
		
		

	}
	@After
	public void End(Scenario s)  {
		
	
		
		if (s.isFailed()) {
			
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		 
			//s.embed(screenshotAs, "image/png");
			s.attach(screenshotAs,"image/png" , s.getName());
			
		} else {
			
			
			//allScreenshot1("screen");
			

		}
	
	}

}
