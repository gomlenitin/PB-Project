package org.main;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="",glue="org.steps",monochrome=true,dryRun=false,tags="@test1",
plugin= {"html:src\\test\\resources\\Reports","junit:src\\test\\resources\\Reports\\kbl.xml",
		"json:src\\test\\resources\\Reports\\kblout.json","rerun:src\\test\\resources\\Reports\\Fail.txt"})
public class Rerunnerclass {
	
	

}
