package data_Files;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

  // Read Data From Excel

public class Excel_User_Data {

	public static String readData(String Sheetname,int Row,int Cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{ 
		FileInputStream fis = new FileInputStream("C:\\Users\\abcd\\Desktop\\Selenium\\Selenium\\Project\\CloudApp.xlsx");

		Workbook w1= WorkbookFactory.create(fis);

		String s1= w1.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		return s1;	
	}

	// Write Data In Excel

	public static void writeDate(String Sheetname,int Row,int Cell,String Data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis2 = new FileInputStream("C:\\Users\\abcd\\Desktop\\TestData\\CloudApp.xlsx");

		Workbook w2= WorkbookFactory.create(fis2);
		Sheet s2=w2.getSheet(Sheetname);
		org.apache.poi.ss.usermodel.Row s3=s2.getRow(Row);
		org.apache.poi.ss.usermodel.Cell s4=s3.createCell(Cell);
		s4.setCellValue(Data);
		FileOutputStream sec= new FileOutputStream("C:\\Users\\abcd\\Desktop\\Selenium\\Selenium\\Project\\CloudApp.xlsx");
		w2.write(sec);	
	}





}


