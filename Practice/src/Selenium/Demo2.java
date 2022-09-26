package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static void main(String[] args) throws IOException {
String path = "C:\\Users\\HP\\OneDrive\\Desktop\\Book1.xlsx";
		
		File file = new File (path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("usernameis "+username);
		
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("pass is "+pass);
		
		//close
		wb.close();
		
		//driver.close
		System.out.println("good");
		
		
		

	}

	}


