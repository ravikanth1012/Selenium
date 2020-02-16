package com.sample_tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Excel_Sheet {

	public  static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");

		Workbook w1= WorkbookFactory.create(fis);

		Sheet s2= w1.getSheet("Sheet1");
		Row r1=s2.getRow(1);
		Cell c1= r1.createCell(3);
		c1.setCellValue("java");
		FileOutputStream sec= new FileOutputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");
		w1.write(sec);
		w1.close();
	}
}	
