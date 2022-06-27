package SampleProject1.SampleProject1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args)  {
       Properties properties;
	  String propertyFilePath= "D:\\Software Testing (2022)\\8. Sample Codes(Java)\\SampleProject1\\Resources\\Config\\PropertiesFile.properties";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}	
		
		System.out.println(properties.getProperty("name"));
	}
		
	}




