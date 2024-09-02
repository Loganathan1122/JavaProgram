package com.learn;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Learing {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\LOGANATHAN\\eclipse-workspace\\Learn\\aa\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver(); //upcast
		System.out.println("edge is open ");
		
		driver.get("https://www.amazon.in/");
	
		 driver.manage().window().maximize();
		driver.manage().ime();
		
		
	
		
//		System.out.println("browser exit");
//		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("form:j_idt95")).click();
		
		
	}

}
