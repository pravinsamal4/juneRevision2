package Selenium_start;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C2_ReadDataFromProperty {
	
	public static void main(String []args) throws IOException {
		
		//create object of FileInputStrem
		FileInputStream myfile=new FileInputStream("D:\\practice_selenium\\june_practice\\Selenium_start\\src\\myproperty.properties");
		
		//Create object of Prorerties class
		
		Properties pro=new Properties();
		
		pro.load(myfile);
		
		System.out.println(pro.getProperty("mobNum"));
	System.out.println(	pro.getProperty("PWD"));
	System.out.println(pro.getProperty("UN"));
	}

}
