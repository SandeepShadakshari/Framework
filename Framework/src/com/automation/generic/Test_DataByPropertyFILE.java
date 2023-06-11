package com.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_DataByPropertyFILE implements Framework_Constants
{
	public static FileInputStream fis;
	
	public static String getData(String key)
	{
		try {
			fis=new FileInputStream(PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
	}
}
