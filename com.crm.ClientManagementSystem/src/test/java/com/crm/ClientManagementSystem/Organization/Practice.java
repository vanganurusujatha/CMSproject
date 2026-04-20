package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtilis;

import ObjectRepository.OrganizationPage;

public class Practice extends Baseclass{
	@Test
	public void Practice() throws EncryptedDocumentException, IOException {
	
		FileUtilis f= new FileUtilis();
		String oraganizationName = f.readDataFromExcel("TestingData", 1, 1);
		OrganizationPage op = new OrganizationPage(driver);
		op.getOrgname().sendKeys(oraganizationName);
	

}
}