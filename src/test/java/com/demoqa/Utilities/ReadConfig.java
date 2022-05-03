package com.demoqa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
  Properties pro;
  
  public ReadConfig()
  {
	  File src = new File("./Configuration/config.properties"); //1
	  FileInputStream fis = null;
	{
		  try {
			fis = new FileInputStream(src); //2
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  }
	  pro = new Properties(); //3
	  {
		  try {
			pro.load(fis); //4
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  }
  }

	public String getAppURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String Uname=pro.getProperty("username");
		return Uname;
	}
	public String getPass()
	{
		String Upass=pro.getProperty("password");
		return Upass;
	}
	public String getChormepath()
	{
		String Chromepath=pro.getProperty("chromepath");
		return Chromepath;
	}
	public String getFirefoxpath()
	{
		String Firefoxpath=pro.getProperty("firefoxpath");
		return Firefoxpath;
	}
	public String getMicroedgepath()
	{
		String Microedgepath=pro.getProperty("microsoftedg");
		return Microedgepath;
	}
}