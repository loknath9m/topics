package CoreJava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadingPropertiesfile {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader file=new FileReader("C:\\Users\\M Loknath reddy\\eclipse-workspace\\Topics\\src\\TestData.properties");
	    Properties prop=new Properties();
	    prop.load(file);
	  System.out.println(prop.get("browser"));
	

	}

}
