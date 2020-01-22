package hr.cube.qa.automatizacija;


	import java.io.File;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	import com.assertthat.selenium_shutterbug.core.Shutterbug;

	public class TestPage extends App {

		
		
			
			@Test
			public void Test() throws InterruptedException {
				
			System.out.print("Test start \n");
			driver.get("https://demoqa.com/");
			System.out.print("Driver get \n");

			
			//Droppable
			
			

			
			driver.findElement(By.linkText("Droppable")).click();
			
			
			
			
			System.out.print("dropabble clicked \n");
			
			//Assigned web elements into variables
			WebElement moveHere = driver.findElement(By.id("droppable"));
			WebElement we = driver.findElement(By.id("draggable"));
			
			Actions action = new Actions(driver);
			//click and hold the file(webelement) then move into the folder (on antoher webelement)
			action.moveToElement(we).clickAndHold().release(moveHere).perform();
				
			

			
			//Tooltip
			driver.findElement(By.linkText("Tooltip")).click();
			System.out.print("Tooltip clicked \n");
			WebElement element_enter = driver.findElement(By.id("age"));
			element_enter.sendKeys("30");
			
			

			//Tabs
			driver.findElement(By.linkText("Tabs")).click();
			driver.findElement(By.id("ui-id-2")).click();
			driver.findElement(By.id("ui-id-3")).click();
			
			
			
			//Selectmenu
			driver.findElement(By.linkText("Selectmenu")).click();
			
			System.out.print("Selectmenu clicked \n");
			
			
			driver.findElement(By.id("speed-button")).click();
			
			driver.findElement(By.id("ui-id-4")).click();
			System.out.print("Fast clicked \n");
			

			driver.findElement(By.id("files-button")).click();
			
			driver.findElement(By.id("ui-id-7")).click();
			System.out.print("Fast clicked \n");
			
			
			driver.findElement(By.id("number-button")).click();
			
			driver.findElement(By.id("ui-id-14")).click();;
			System.out.print("Fast clicked \n");
			
			
			driver.findElement(By.id("salutation-button")).click();
			
			driver.findElement(By.id("ui-id-32")).click();;
			System.out.print("Fast clicked \n");
			
			
			//Dialog
			driver.findElement(By.linkText("Dialog")).click();
			System.out.print("Dialog clicked \n");
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/span[1]")).click();
			System.out.print("X clicked \n");

			
			//Datepicker
			driver.findElement(By.linkText("Datepicker")).click();
			System.out.print("Datepicker clicked \n");
			
			driver.findElement(By.id("datepicker")).sendKeys("14/07/2019");
			
			//Checkboxradio
			driver.findElement(By.linkText("Checkboxradio")).click();
			System.out.print("Checkradio clicked \n");
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Paris'])[1]/span[1]")).click();
			System.out.print("Paris clicked \n");
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hotel Ratings:'])[1]/following::span[3]")).click();
			System.out.print("3 star clicked \n");
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hotel Ratings:'])[1]/following::span[5]")).click();
			System.out.print("5 star clicked \n");
			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bed Type:'])[1]/following::span[7]")).click();
			System.out.print("1king clicked \n");
			
			
			//Accordion
			driver.findElement(By.linkText("Accordion")).click();
			System.out.print("Accordion clicked \n");
			
			driver.findElement(By.id("ui-id-3")).click();
			
			driver.findElement(By.id("ui-id-5")).click();

			
			//Screenshot
		    //Current Directory
			Shutterbug.shootPage(driver).withName("SampleScreenshot").save();

			}	
		}

