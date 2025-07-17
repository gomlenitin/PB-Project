package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/*
 * --------Functional List-------------
 * 1.Launch Any Browser
 * 2.Launch the Url
 * 3.Screen Maximize
 * 4.Get the UrlTittle
 * 5.Get the Current Page Url
 * 6.Sendvalues for Textbox
 * 7.Click the Element
 * 8.Clear the Values
 * 9.Get the Text From Webpage
 * 10.Get the Attributte values From Webpage
 * 11.MouseHover In Actions Class
 * 12.Get the Webpage page Source Code
 * 13.Launch URL Navigation methods
 * 14.Screenshot By Using Takescreenshot
 * 15.Simple Alert Handling
 * 16.Dropdown By Using select class -SelectByindex
 * 17.Dropdown By Using select class -SelectBytext
 * 18.Static Wait
 * 19.Dynamic Wait --Implicit Wait 
 * 20.Click Using By JavascriptExecutor
 * 21.SendValue into text box Using By JavascriptExecutor
 * 22.Switch into Frame Using by txt
 * 23.SwithTo window based on Window ID 
 * 24.Verification and Vadidation Using By Assertion
 * 25.To read the Excel
 * 26.To create the Excel sheet
 * 27.Scrollup & Scrolldown  Using By JavascriptExecutor
 * 
 */

public class Ultilityclass {
	
	
	
	public static Actions actions;
	public static  WebDriver driver;
	public static Navigation navigate;
	public static TakesScreenshot screen;
	public static Alert alert;
	public static Select select;
	public static JavascriptExecutor js;
	
	/*
	 * @author:MOHANRAJ K
	 * @ Purpose:  Launch Any Browser
	 */
	
	public static void launchBrowser (int B) {
		
		if (B==1) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}
		else if (B==2) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		else if (B==3)  {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
	}
		else {
			
			System.out.println("null");
			
		}
		
	
	}
	

    /*
	 * @author:MOHANRAJ K
	 * @ Purpose:Launch the Url
	 */
	public  static void launchurl(String Enterurl) {
		
		driver.get(Enterurl);

}
public  static void close() {
		
		driver.close();

}
     /*
	  * @ Purpose: Screen Maximize
	  */

    public  static void pagemaximize () {
		
		driver.manage().window().maximize();
		}
     /*
	  * @ Purpose: Screen Minimize
	  */
   public  static void pageminimize () {
		
		driver.manage().window().minimize();
   }   
     /*
	  * @ Purpose: Get the UrlTittle
	  */
	
   public static void urlTittle() {
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	  }
     /*
	  * @ Purpose: Get the Current Page Url
	  */
   
  public static void currentUrl() {
	   
	   String Current = driver.getCurrentUrl();
	   System.out.println(Current);
	   
	  }
     /*
	  * @ Purpose: Sendvalues for Textbox
	  */
  public static void PassValues(WebElement eleName,String Value) {
	  eleName.sendKeys(Value);
	   
	    }
     /*
	  * @ Purpose: Click the Element
	  */
    public static void ClickElement(WebElement eleName) {
    	
    	eleName.click();

}
     /*
	  * @ Purpose: Clear the Values
	  */
    
     public static void clearvalue(WebElement eleName) {
    	
    	eleName.clear();

}
     
     /*
	  * @ Purpose: Get the Text From Webpage
	  */
     public static void getText(WebElement eleName) {
     	
     	String text = eleName.getText();
     	System.out.println(text);

 }
     
     /*
	  * @ Purpose: Get the Text From Webpage
	  */
     public static String  getText1(WebElement eleName) {
     	
     	String text1 = eleName.getText();
     	return text1;

 }
     /*
	  * @ Purpose: Get the Attributte values From Webpage
	  */
     public static String getAttributte (WebElement eleName) {
      	
      	String Attribute = eleName.getAttribute("value");
      	return Attribute;
  }

     /*
	  * @ Purpose: Get the Webpage page Source Code
	  */
     
     public static void getPagesource () {
       	
       	String pageSource = driver.getPageSource();
       	System.out.println(pageSource);

   }
     public static void StartTimeprint () {
        	
        Date c = new Date();	
        System.out.println("Start Time:"+c);

    }
     public static void EndTimeprint () {
     	
         Date d = new Date();	
         System.out.println("End Time:" +d);

     }
     
    /*
 	 * @author:MOHANRAJ K
 	 * @ Purpose:MouseHover In Actions Class
 	 */
     public static void moveToElement (WebElement TargetName ) {
        	
        	actions = new Actions(driver);
        	actions.moveToElement(TargetName).perform();
    }
    /*
  	 * @ Purpose:Drag and Drop THE Element
  	 */
     public static void dragAnddrop (WebElement SourceName,WebElement TargetName ) {
     	
     	actions = new Actions(driver);
     	actions.dragAndDrop(SourceName, TargetName).perform();
 }
     
    /*
   	 * @ Purpose:Right Click Element
   	 */
     
     public static void rightClick (WebElement SourceName) {
      	
      	actions = new Actions(driver);
      	actions.contextClick(SourceName).perform();
  }
        /*
    	 * @ Purpose:Double  Click the Element
    	 */
     
     public static void doubleClick (WebElement SourceName) {
      	
      	actions = new Actions(driver);
      	actions.contextClick(SourceName).perform();
      	
  }
     /*
   	 * @ Purpose: Send the Values By Using  Action Class
   	 */
      public static void actionSenkeys (WebElement SourceName,String Value) {
         	
         	actions = new Actions(driver);
         	actions.sendKeys(SourceName, Value).perform();
         	 }
    /*
 	 * @ Purpose: Click the Element By Using Action Class
 	 */
     
     public static void actionClick (WebElement SourceName) {
       	
       	actions = new Actions(driver);
       	actions.click(SourceName).perform();
       	
   }
	 
      /*
       * @ Purpose: Click and Hold the Element
       */

    public static void clickAndhold (WebElement SourceName,WebElement TargetName) {
	
	actions = new Actions(driver);
	actions.clickAndHold(SourceName).perform();
	actions.release(TargetName).perform();
    }
    
    /*
     * @ Purpose: Navigation URL Launch
     */
    
    public static void  navigateTo(String url) {
		navigate = driver.navigate();
		
		navigate.to(url);
}
    /*
     * @ Purpose:  Refresh page Using navigation
     */
    public static void navigateRefresh() {
		navigate = driver.navigate();
		navigate.refresh();
	}
    
    /*
     * @ Purpose:  Forward page Using navigation
     */
    
    public static void navigatefoward() {
		navigate = driver.navigate();
		navigate.forward();
	}
    
    /*
     * @ Purpose:  Back page Using navigation
     */
    
     public static void navigateBack() {
		navigate = driver.navigate();
		navigate.back();
	}
     
     /*
      * @ Purpose:  Screenshot By Using Takescreenshot
      */
     
     public static void takeScreenshot(String file)   {
    	try {
    	 screen = (TakesScreenshot) driver;
    	 
    	 File ScreenshotAs =screen.getScreenshotAs(OutputType.FILE);
    	 File  des = new File(file);
    	 FileUtils.copyFile(ScreenshotAs, des);
    	 
    	 }
    	catch (IOException e) {
    		e.getMessage();
    	}
			
		}
    	 

     /*
      * @ Purpose:  KBL--Screenshot By Using Takescreenshot
      */
     
     public static void allScreenshot(String screen) throws IOException  {
    		try {
    	 TakesScreenshot tk = (TakesScreenshot) driver;
    	 
    	 File ScreenshotAs =tk.getScreenshotAs(OutputType.FILE);
    	 File  des = new File("E:\\MOHAN\\KBL\\Snap\\"+screen+".jpg");
    	 FileUtils.copyFile(ScreenshotAs, des);
    	 
    	 }
    		catch (IOException e) {
        		e.getMessage();
        	}
     
     }
     

     /*
      * @ Purpose:  AKI--Screenshot By Using Takescreenshot
      */
     
     public static void allScreenshot1(String screen) throws IOException  {
 		try {
 	 TakesScreenshot tk = (TakesScreenshot) driver;
 	 
 	 File ScreenshotAs =tk.getScreenshotAs(OutputType.FILE);
     File  des = new File("E:\\MOHAN\\AKI-Petit\\Screenshot\\"+screen+".jpg");
 	 FileUtils.copyFile(ScreenshotAs, des);
 	 
 	 }
 		catch (IOException e) {
     		e.getMessage();
     	}
  
  }

     
     /*
      * @ Purpose:  Simple Alert Handling
      */
     public static void simpleAlert() {
		alert = driver.switchTo().alert();
		alert.accept();
}
     
     public static void conformalert() {
    	 alert = driver.switchTo().alert();
 		 alert.dismiss();

	}
     

     /*
      * @author: MOHANRAJ K
      * 
      * @ Purpose:  Dropdown By Using select class -SelectByindex
      */
     
     
     public static void selectByindex(WebElement selectRef,int index) {
    	 select = new  Select (selectRef);
    	 select.selectByIndex(index);

	}
     /*
      * @ Purpose:  Dropdown By Using select class -SelectBytext
      */
     public static void selectBytext(WebElement selectRef,String text) {
    	 select = new  Select (selectRef);
    	 select.selectByVisibleText(text);

	}
     /*
      * @ Purpose:  DrselectByvalueopdown By Using select class -SelectByvalue
      */
     public static void selectByvalue(WebElement selectRef,String value) {
    	 select = new  Select (selectRef);
    	 select.selectByValue(value);

	}
     /*
      * @ Purpose:  Dropdown By Using select class -FirstSelectedoption
      */
     public static void FirstSelectedoption(WebElement selectRef) {
    	 select = new  Select (selectRef);
    	 select.getFirstSelectedOption();

	}
     /*
      * @ Purpose:  Dropdown By Using select class -Getoptions
      */
     public static void getOptions(WebElement selectRef) {
    	 select = new  Select (selectRef);
    	 select.getOptions();

	}
     /*
      * @ Purpose:  Dropdown By Using select class -deselectByIndex  
      */
     public static void deselectByIndex (WebElement selectRef,int index) {
    	 select = new  Select (selectRef);
    	 select.deselectByIndex(index);

	}
     
     /*
      * @ Purpose:  Dropdown By Using select class -deselectByIndex  
      */
     public static void deselectBytext (WebElement selectRef,String text) {
    	 select = new  Select (selectRef);
    	 select.deselectByVisibleText(text);

	}
     

     /*
      * @ Purpose:  Dropdown By Using select class -deselectByvalue  
      */
     public static void deselectByvalue (WebElement selectRef,String value) {
    	 select = new  Select (selectRef);
    	 select.deselectByValue(value);

	}
     


     /*
      * @ Purpose:  Static Wait 
      */
     
     public static void Threadsleep(int sec){
    	 try {
    		 
    		 Thread.sleep(sec);
			} 
    	 
    	 catch (InterruptedException e) {
            e.getMessage();
			
		}
    	
	
     }

     /*
      * @ Purpose:  Dynamic Wait --Implicit Wait 
      */
     
     public static void implicitWait() {
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
     
     /*
      * @ Purpose:  Click Using By JavascriptExecutor
      */
     public static void javascriptclick (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].click()",ele);
     }
     /*
      * @ Purpose:  SendValue into text box Using By JavascriptExecutor
      */
     public static void javascriptsetAttribute (String text,WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].setAttribute('value','"+text+"')",ele);
     }
     
     /*
      * @ Purpose:  GetAttribute Using By JavascriptExecutor
      */
     public static void javascriptGetAttribute (String value,WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("return arguments[0].getAttribute('"+ value +"')",ele);      
     }

     /*
      * @ Purpose:  Scrolldown  Using By JavascriptExecutor
      */
     public static void Scrolldownjavascript (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].ScrollIntoview(true)",ele);      
     }
     
     /*
      * @ Purpose:  Scrollup  Using By JavascriptExecutor
      */
     public static void Scrollupjavascript (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].scrollIntoview(false)",ele);      
     }
     /*
      * @ Purpose:  ZoomIn and Out Using By JavascriptExecutor
      */
     public static void ZoomInout (int  percent) {
 		
         js =(JavascriptExecutor)driver;
         String Zoom ="document.body.style.zoom= '"+percent+"%;'";
         js.executeScript(Zoom);      
   }
     /*
      * @ Purpose:  Swith into Frame Using by txt
      */
     public static void switchframe (String frame) {
  		
         driver.switchTo().frame(frame);    
   }
     /*
      * @ Purpose:  Swith into Frame Using by index
      */
     
     public static void switchframeindex (int index) {
   		
         driver.switchTo().frame(index);    
   }
     /*
      * @ Purpose:  Swith into Frame Using by Webelement
      */
     
     public static void switchframeelement (WebElement ele) {
   		
         driver.switchTo().frame(ele);    
   }
     
     /*
      * @ Purpose:  SwithTo window based on Window ID 
      */
     
     public static void window (String  ID) {
   		
         driver.switchTo().window(ID);
   }
     
     /*
      * @ Purpose:  Verification and Vadidation Using By Assertion
      */
     public static void checkpresentElement(String commit,boolean ele) {
    	 
    	Assert.assertTrue(commit, ele);
     }
     /*
      * @ Purpose:  Verification Using By text
      */
    
     public static void checkequaltext(String commit,String expected,String Actual) {
    	 
    	 Assert.assertEquals(commit, expected, Actual);
    	 
     	
      }
     /*
      * @ Purpose:  Verification Using By text and webelement
      * 
      */
     
     public static void checkequalElement(String commit,WebElement Expected,WebElement Actual) {
    	 
    	 Assert.assertEquals(commit, Expected, Actual);
    		
      }
     
     /*
      * @ Purpose:  To read the Excel
      */
    
     public static String  getdataExcel(int row,int col)   {
    	 String value = "";
    	 
    	 try {
     File f = new File ("E:\\MOHAN\\Bisina\\target\\Data\\Petit-stage data.xlsx"); 
     FileInputStream fin = new FileInputStream(f); 
     Workbook w = new XSSFWorkbook(fin);
     Sheet sheet = w.getSheet("Address data");
     Row rowdata = sheet.getRow(row);
     Cell cell = rowdata.getCell(col);
    
     CellType type = cell.getCellType();
     
     
     if (type == CellType.STRING) {
    	 
    	 value = cell.getStringCellValue();
		
	}
     else if (type == CellType.NUMERIC) {

    	 double Digit = cell.getNumericCellValue();
    	 
    	 long l = (long)Digit;
    	 
    	  value = String.valueOf(l);
    	 
    	
	}
     else if (DateUtil.isCellDateFormatted(cell)){
    	 
    	 Date D = cell.getDateCellValue();
 		
     	 SimpleDateFormat sim = new SimpleDateFormat("dd,mm,yyyy");
     	
     	 value = sim.format(D);
    	 
     }
    	 }catch (IOException e) {
			e.printStackTrace();
		}
     
     return value;
     
     }
     
     /*
      * @ Purpose:  To create the Excel sheet
      * 
      */
     
     public static void createSheet (String filepath,int row,int col,String value) {
    	try {
    	 File f =new File (System.getProperty("user.dir")+filepath);
    	 Workbook w = new XSSFWorkbook();
    	 Sheet CS = w.createSheet();
    	 Row CR = CS.createRow(row);
    	 Cell C = CR.createCell(col);
    	 C.setCellValue(value);
    	 FileOutputStream fileout = new FileOutputStream(f);
    	 w.write(fileout);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	
    	 
     }    
     
	
	
	
	

}
