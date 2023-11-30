package test;

import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	@Test

	public void myhomeloan() {

		System.out.println("homeloan");
		
	}
	@BeforeMethod
	public void myhoan() {

		System.out.println("before any start i am from before metod");
	}
	@Test(groups = {"Smoke"})

		public void mycarloan() {

			System.out.println("carloan");
		}
	
	@BeforeTest
	public void mefirst() {

		System.out.println("i am the firrst ");
	}
	
	
	@AfterTest
	public void melastt() {

		System.out.println("i am the lastt ");
	}
	
	@Test(dataProvider = "getData")
	
	public void mymobileloan(String username,String password) {

		System.out.println("mobloan");
		System.out.println("usernmae");
		System.out.println("password");
	}

	@DataProvider
	public Object[][] getData() {
		Object [][] data= new Object[3][2];
		
		data[0][0]="fusername";
		data[0][1]="fpass";	
		data[1][0]="susername";
		data[1][1]="spass";
		data[2][0]="tusername";
		data[2][1]="tpass";
		return data;
	}
	
}
