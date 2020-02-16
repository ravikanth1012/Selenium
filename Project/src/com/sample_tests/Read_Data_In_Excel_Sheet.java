package com.sample_tests;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_In_Excel_Sheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");

		Workbook w1= WorkbookFactory.create(fis);

		String s1= w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(s1);	
	}
}	
