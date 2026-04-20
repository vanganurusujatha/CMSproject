package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtilis;
import com.crm.ClientManagementSystem.GenericLibrary.JavaUtility;
import com.crm.ClientManagementSystem.GenericLibrary.ListenerImplementation;

import ObjectRepository.Contactspage;
import ObjectRepository.HomePage;

@Listeners(ListenerImplementation.class)
public class CreateContacts extends Baseclass {
	

	@Test
	public void create() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getContactelement().click();
		Contactspage cp = new Contactspage(driver);
		cp.getPlusicon().click();
        FileUtilis f = new FileUtilis();
      String lastname = f.readDataFromExcel("Contacts", 1, 1);
      String organizationname = f.readDataFromExcel("Contacts", 1, 2);
      String email = f.readDataFromExcel("Contacts", 1, 3);
      String mailingcity = f.readDataFromExcel("Contacts", 1, 4);
      String othercity = f.readDataFromExcel("Contacts", 1, 5);
      String mailingstate = f.readDataFromExcel("Contacts", 1, 6);
      String otherstate = f.readDataFromExcel("Contacts", 1, 7);
      String mailingcountry = f.readDataFromExcel("Contacts", 1, 8);
      String othercountry = f.readDataFromExcel("Contacts", 1, 9);
      String Desp = f.readDataFromExcel("Contacts", 1, 10);
      JavaUtility j = new JavaUtility();
    int number = j.ganerateRandom(25);
    cp.createcontacts(driver, "Ms.", lastname, organizationname+" "+number , email, mailingcity, othercity, mailingstate, otherstate, mailingcountry, othercountry, Desp);
      
	}
	

}