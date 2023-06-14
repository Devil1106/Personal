package testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import demobase.Base;

public class testcase1 extends Base {

	 
	
   
   public String eCharterID;
   
   @Test
   public void TS364() throws InterruptedException, IOException
 {
	   
	   //Requestor charter creation//
	   
	   Thread.sleep(1000);
 	   driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
 	   Thread.sleep(1000);
 	   driver.findElement(By.id(login.getProperty("username"))).sendKeys("QUENNIE.BADILLA@IHIS.COM.SG");
 	   Thread.sleep(1000);
 	   driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
 	   Thread.sleep(1000);
 	   driver.findElement(By.xpath(login.getProperty("login"))).click();
 	   
 	   driver.findElement(By.xpath(login.getProperty("requestor_function"))).click();
 	   driver.findElement(By.xpath(login.getProperty("create_charter"))).click();
 	 
       driver.findElement(By.xpath(login.getProperty("radiobutton2"))).click();
 	   driver.findElement(By.id("projectNature")).click();
 	   driver.findElement(By.xpath("//div[text()='Project']")).click();
 	   driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/app-createcharter/div/div[2]/div/app-cgeneral/div/div[3]/p-panel/div/div[2]/div/div[2]/div[2]/div[2]/p-dropdown/div/div[2]")).click();
 	   driver.findElement(By.xpath("//div[text()='Workplan']")).click();
 	   driver.findElement(By.id("hitmapAlignment")).click();
 	   driver.findElement(By.xpath("//span[text()='C1-Analytics engine for profiling inclusive of medical, social']")).click();
 	   driver.findElement(By.xpath("//span[text()='Next']")).click();
 	   driver.findElement(By.id("projectName")).sendKeys("TS 364");
 	   driver.findElement(By.id("projectDescription")).sendKeys("Automation");
 	   driver.findElement(By.id("projectscope")).sendKeys("Automation");
 	   driver.findElement(By.xpath("//span[text()='Next']")).click();
 	   driver.findElement(By.id("iHiSProjectOwnerDep")).click();;
 	   driver.findElement(By.xpath("//div[text()='10012600 Solution Architecture']")).click();
       driver.findElement(By.id("CostCentre")).click();
       driver.findElement(By.xpath("//li[@role='option']")).click();
       driver.findElement(By.xpath("//span[text()='Add System']")).click();
        
        Thread.sleep(2000);
        try {
			
			driver.findElement(By.xpath("(//button[contains(.,'OK')])[2]")).click();
			
			
		    }
		catch(Exception error)
		{
			System.out.println(error);
		}
 
        
        driver.findElement(By.xpath("//a[normalize-space()='Expand All']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p-dropdown[1]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'S0005 - ESB (rhapsody integration Engine)')]")).click();
        driver.findElement(By.id("systemOwner")).click();  
        driver.findElement(By.xpath("//li[@aria-label='10012600 Solution Architecture']")).click();
        driver.findElement(By.id("systemOwnerCC")).click();
        driver.findElement(By.xpath("//div[contains(text(),'1010201')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/i[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[5]/div[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/p-radiobutton[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/div[1]/div[2]/i[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Abadiano Cyril Almayda']//div[@class='p-checkbox-box']")).click(); 
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        Thread.sleep(1000);
        driver.findElement(By.id("ProjectPhase")).click();
        Thread.sleep(2000);
        
        try {
        	driver.findElement(By.xpath("//div[text()='Execution']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
      
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]/div[2]/i[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[6]/div[2]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/p-checkbox[1]/div[1]/div[2]")).click(); 
        driver.findElement(By.xpath("//span[text()='Add']")).click();
        driver.findElement(By.id("navigators")).sendKeys("05/2022");
        driver.findElement(By.xpath("(//input[@id='navigators'])[2]")).sendKeys("12/2022");
        driver.findElement(By.xpath("//input[@id='SapId']")).sendKeys("k-kk-kk-kkkk-kk");

        driver.findElement(By.id("NationalProgrammeName")).click();
        driver.findElement(By.xpath("(//div[.='Z0020 BILLING TRANSFORMATION                                                  '])[1] ")).click();
        
// 		eventfiringwebdriver.executeScript("document.querySelector(\".formheight\").scrollTop=1600");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='p-radiobutton-box'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Managed")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='IHiS']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("driven")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Application']")).click();
        driver.findElement(By.xpath("(//span[.='Add'])[2]")).click();
        driver.findElement(By.id("nameofParticipatingInstitutions")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("MOH");
        driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
        Thread.sleep(2000);
        
        try {
        	
        	driver.findElement(By.id("IAA_Ref_IDDS")).click();
           // driver.findElement(By.xpath("(//input[contains(@type,'text')])[19]")).sendKeys("chcs");
            driver.findElement(By.xpath("//div[.='APR110627-1 CHCS                                                                                                '] ")).click();
        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        Thread.sleep(2000);
        driver.findElement(By.id("ope")).click();
       // driver.findElement(By.xpath("(//input[contains(@type,'text')])[20]")).sendKeys("DEV");
        driver.findElement(By.xpath("(//div[.='DEV'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("PPMReference")).click();
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[21]")).sendKeys("c3");
        driver.findElement(By.xpath("(//div[.='C3(APR110627-1) - C3 - Recurrent Opex - CH Claimable Items'])[1]")).click();
        
//        driver.findElement(By.id("IOCode")).sendKeys("B0025");
//        driver.findElement(By.id("InstitutionCCcode")).sendKeys("C0025");
//        driver.findElement(By.id("PPMReference")).sendKeys("Test");
        driver.findElement(By.id("sumofIHISManpower")).sendKeys("1000");
        Thread.sleep(1000);
        driver.findElement(By.id("billingMethod")).click();
        driver.findElement(By.xpath("//div[.='Periodic']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("billingRateType")).click();
        driver.findElement(By.xpath("//div[contains(text(),'CIO Service Rate- $680')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[7]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[2]/input[1]")).sendKeys("100");
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[7]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[2]/div[2]/input[1]")).sendKeys("100");
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-cost-allocation[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/p-accordion[1]/div[1]/div[7]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[2]/div[9]/div[1]/div[2]/input[1]")).sendKeys("100");
        driver.findElement(By.id("sumOtherCosts")).sendKeys("100");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[.='Add'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='p-button-outlined p-button p-component'][normalize-space()='OK']")).click();
        
        //eventfiringwebdriver.executeScript("document.querySelector(\".formheight\").scrollTop=3200");
        Thread.sleep(2000);
        driver.findElement(By.id("syshardware_software")).click();
        driver.findElement(By.xpath("//li[@aria-label='Yes']")).click();
        driver.findElement(By.id("sysITsystem")).click();
        driver.findElement(By.xpath("//li[@aria-label='Yes']")).click();
        driver.findElement(By.xpath("//div[@class='px-2']//p-radiobutton[@id='sysGoLivedate']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Save System']")).click();
        Thread.sleep(3000);
        try {
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
			
			
		    }
		catch(Exception error)
		{
			System.out.println(error);
		}
 		
        driver.findElement(By.xpath("//td[@class='s7']//input[@type='checkbox']")).click();	
 		
        driver.switchTo().alert().accept();
 		
        driver.findElement(By.id("allsystemadd")).click();
      //eventfiringwebdriver.executeScript("document.querySelector(\".formheight\").scrollTop=2000");

        driver.findElement(By.id("hardware_software")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item p-ripple'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ITsystem")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item p-ripple'])[1]")).click();
        driver.findElement(By.id("GoLivedate")).click();
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
 		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
 		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
 		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
 		
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@clas='col-md-2'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("a");
        Thread.sleep(1000);
        driver.findElement(By.xpath(login.getProperty("radiobutton2"))).click();
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        //Thread.sleep(2000);
        Thread.sleep(3000);
        driver.findElement(By.id("IHISProjectOwner")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
      
        driver.findElement(By.xpath("(//div[@clas='col-md-2'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ling su");
        driver.findElement(By.xpath(login.getProperty("radiobutton2"))).click();
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        
        driver.findElement(By.id("IHISProjectOwner")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
        

//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//div[@class='col-md-0 ng-star-inserted'])[1]")).click();
//        driver.findElement(By.id("ProjectCluster")).click();
//        driver.findElement(By.xpath("//span[.='NHG']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//div[@class='p-checkbox p-component'])[6]")).click();
//        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        driver.findElement(By.xpath("//u[.='Click here to Assign']")).click();
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        driver.findElement(By.xpath("(//p-radiobutton[@id='Routing'])[1]")).click(); 
        driver.findElement(By.id("Role")).click(); 
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item p-ripple'])[1]")).click(); 
        driver.findElement(By.xpath("//i[@class='fa fa-address-card-o py-2']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='p-radiobutton-box'])[41]")).click();
        driver.findElement(By.xpath("//span[text()='Add']")).click(); 
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/app-createcharter[1]/div[1]/div[2]/div[1]/app-approval[1]/div[1]/div[3]/div[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("Test"); 
        driver.findElement(By.xpath("//span[text()='Save']")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@class='p-button-outlined p-button p-component'])[5]")).click(); 
        driver.findElement(By.xpath("(//span[@class='p-button-label'])[4]")).click(); 
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
 		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
 		
 		// this code will execute screen shot
 		
 		Thread.sleep(2000);
 	    File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 	    FileUtils.copyFile(Screenshot, new File(".//sreenshot/submit result"+timestamp+".png"));
 	    
 	    WebElement txt = driver.findElement(By.tagName("p"));
 	    txt = driver.findElement(By.tagName("p"));
 	    String str = txt.getText();
 	    eCharterID = str.substring(9, 22);
 	    System.out.println(eCharterID);
 	   
 	    driver.findElement(By.xpath("//span[.='Ok']")).click();
 	    Thread.sleep(2000);
 	    driver.findElement(By.xpath("//span[.='Logout']")).click();
 	    Thread.sleep(2000);
 	    
 	    
 	    // RO & PO approval//
 	    
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("SUYUEN.LING@IHIS.COM.SG");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a)[18]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
	    driver.findElement(By.xpath("//span[.='Apply']")).click();
	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[.='Approve']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Ok']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[.='Logout']")).click();
 	    Thread.sleep(2000);
 	    
 	   // PMO validate//
 	    
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("loren.meiliana.shinta@ihis.com.sg");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a)[18]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
	    driver.findElement(By.xpath("//span[.='Apply']")).click();
	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[.='Validate']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[.='Submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Ok']")).click();
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[.='Logout']")).click();
 	    Thread.sleep(2000);
 	    
 	   // CIOO validate//
 	    
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("KENNY.LEE@IHIS.COM.SG");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
//	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//a)[18]")).click();
//	    Thread.sleep(7000);
//	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
//	    driver.findElement(By.xpath("//span[.='Apply']")).click();
//	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//span[.='Validate']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[.='Submit']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[.='Ok']")).click();
//        Thread.sleep(3000);
//	    driver.findElement(By.xpath("//span[.='Logout']")).click();
// 	    Thread.sleep(2000);
 	    
        // FA approval//
 	    
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("AGUS.SALIM@IHIS.COM.SG");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a)[18]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
	    driver.findElement(By.xpath("//span[.='Apply']")).click();
	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[.='Approve']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Ok']")).click();
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[.='Logout']")).click();
 	    Thread.sleep(2000);
 	    
 	   // CIOO verify //
 	    
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("KENNY.LEE@IHIS.COM.SG");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
// 	    Thread.sleep(1000);
// 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
//	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//a)[18]")).click();
//	    Thread.sleep(7000);
//	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
//	    driver.findElement(By.xpath("//span[.='Apply']")).click();
//	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//span[.='Verify']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[.='Submit']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[.='Ok']")).click();
//        Thread.sleep(3000);
//	    driver.findElement(By.xpath("//span[.='Logout']")).click();
// 	    Thread.sleep(2000);
// 	    
 	   // PMO Verify //
 	    
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("domainname"))).sendKeys("healthgrp.com.sg");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("username"))).sendKeys("JAYALAKSHMI.GUPTA@IHIS.COM.SG");
 	    Thread.sleep(1000);
 	    driver.findElement(By.id(login.getProperty("password"))).sendKeys("eCharter123");
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath(login.getProperty("login"))).click();
	    driver.findElement(By.xpath("//span[text()='Approver Functions']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a)[18]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(eCharterID);
	    driver.findElement(By.xpath("//span[.='Apply']")).click();
	    driver.findElement(By.xpath("(//i[@class='fa fa-check-circle-o ng-star-inserted'])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[.='Verify']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='p-checkbox-box']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[.='Submit']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//span[.='Ok']")).click();
 	    
	 // this code will execute screen shot
 		
	  		Thread.sleep(2000);
	  	    File Screenshotfinal = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  	    FileUtils.copyFile(Screenshotfinal, new File(".//sreenshot/submit result"+timestamp+".png"));
 	    
 	    
 }


	
	
}
