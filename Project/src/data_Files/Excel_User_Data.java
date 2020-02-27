package data_Files;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_User_Data {
 
	public static String readdata(String Sheetname,int Row,int Cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{ 
		FileInputStream fis = new FileInputStream("C:\\Users\\abcd\\Desktop\\TestData\\CloudApp.xlsx");

		Workbook w1= WorkbookFactory.create(fis);

		String s1= w1.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		return s1;	
	}

}


