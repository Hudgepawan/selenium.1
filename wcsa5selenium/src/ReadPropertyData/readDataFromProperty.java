package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class readDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create a object for properties file
		
		Properties pro = new Properties();
		
		//to make ready file to read
		
		pro.load(fis);
		
		//read the property from file
		
		String data = pro.getProperty("Password");
		
		System.out.println(data);
		

	}

}
