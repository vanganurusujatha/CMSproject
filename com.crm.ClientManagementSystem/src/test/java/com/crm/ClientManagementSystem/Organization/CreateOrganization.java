package com.crm.ClientManagementSystem.Organization;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtilis;
import com.crm.ClientManagementSystem.GenericLibrary.JavaUtility;
import com.crm.ClientManagementSystem.GenericLibrary.ListenerImplementation;


import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
@Listeners(ListenerImplementation.class)

public class CreateOrganization extends Baseclass {
	@Test
	public void Create() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getOrgelement().click();
		OrganizationPage op=new OrganizationPage(driver);
		op.getPlusicon().click();
        FileUtilis f = new FileUtilis();

		String organizationName = f.readDataFromExcel("TestingData", 1, 1);
	
		String Email = f.readDataFromExcel("TestingData", 1, 2);

		
		String billaddress = f.readDataFromExcel("TestingData", 1, 3);
		String shipaddress = f.readDataFromExcel("TestingData", 1, 4);
		String billcity  = f.readDataFromExcel("TestingData", 1, 5);
		String shipcity = f.readDataFromExcel("TestingData", 1, 6);
		String billstate = f.readDataFromExcel("TestingData", 1, 7);
		String shipstate = f.readDataFromExcel("TestingData", 1, 8);
		String billcountry = f.readDataFromExcel("TestingData", 1, 9);
		String shipcountry = f.readDataFromExcel("TestingData", 1, 10);
		 String desp = f.readDataFromExcel("TestingData", 1, 11);
		 JavaUtility j = new JavaUtility();
		int number = j.ganerateRandom(25);
		op.createorganization(driver, organizationName+" "+number, shipaddress, "Engineering", Email, billaddress, billcity, shipcity, billstate, shipstate, billcountry, shipcountry, desp);
	}

}
