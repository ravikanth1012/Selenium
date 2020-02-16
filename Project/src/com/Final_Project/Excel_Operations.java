package com.Final_Project;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Operations {
	
	public static String readdata(String Sheetname,int Row,int Cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");

		Workbook w1= WorkbookFactory.create(fis);

		String s1= w1.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		return s1;	
	}

public static void writedate(String Sheetname,int Row,int Cell,String Data) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis2 = new FileInputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");

	Workbook w2= WorkbookFactory.create(fis2);
	Sheet s2=w2.getSheet(Sheetname);
	org.apache.poi.ss.usermodel.Row s3=s2.getRow(Row);
	org.apache.poi.ss.usermodel.Cell s4=s3.createCell(Cell);
	s4.setCellValue(Data);
	FileOutputStream sec= new FileOutputStream("C:\\Users\\BOT\\Desktop\\TestData\\userdata.xlsx");
	w2.write(sec);	
}
}