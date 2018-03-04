package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	Properties pro;// declraed here ok this if i removed ha to ok then ou will do this in config readert function correct?yes but same thng na what will be limited to 
	// that constrtuctor only
	//ok so below method will return null only then?????getgeckopatg method na ? yes ha g kyoki usko to pata nahi na what is pro.ok got
	
	
	public  ConfigReader() {
		
		try
		{
		
	    	File src = new File(".//Configuration//Config.property");
		
	    	FileInputStream fis = new FileInputStream(src);
			
	    	 pro = new Properties();// same varaible defining which is ok now but what you did is see
	    	// if you see here you again declered and defined sop best trick to cathc is check the color or pro which is reddish and throughout class its blue so botah a
	    	// diff ok
	    	//wait i made here objec  of class property yes nice but you did inside configreader constructor so this object cant be useed in other method na 
	    	// remeber global and local scope concept ha to this object scope is limited to this onstructor only? yes obviously, then if i did like this still
	    	 //its a object but its scope is not limited to this constructor only?? ha kyoki you declared is for the class and defined in any function.
	    	 //if i dnt declare it and i do it then it should work na? means you sayig if you remove line 12 and write propetird inside constructor ?
			
			pro.load(fis);
			//String pathin=pro.getProperty("geckodriver");
			//System.out.println("mypath is "+pathin);// yaha to print kya the properly na but is method me nahi kar raha hai 
			//ha
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public String getgeckopath() {
		
			String path="riya";
			path = pro.getProperty("geckodriver");// yaha par null pointer return kar raha hai
			System.out.println(path);
			return path;	
			
		}
		
		public String geturl() {
			String naukri_url = pro.getProperty("url");
					return naukri_url;
		}
		
		public String getsheet_credentials() {
			String sh = pro.getProperty("epath");
			return sh;
		}
	}



