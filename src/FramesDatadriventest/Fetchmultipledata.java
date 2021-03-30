package FramesDatadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchmultipledata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/Multipledata fetch.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
		Row r = null;
		for(int i=0;i<rowcount+1;i++)
			 r = sh.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++)
		{
		System.out.print(r.getCell(j).getStringCellValue() +" " );	
		}
		System.out.println();
		
			
		

	}

}
