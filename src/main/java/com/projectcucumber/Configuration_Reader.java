package com.projectcucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.devtools.v85.runtime.Runtime.GetPropertiesResponse;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class Configuration_Reader { 
	public Properties p ;
	
	public Configuration_Reader() throws IOException {
		

	File f = new File("C:\\Users\\UMAR SALMAN.SK\\eclipse-workspace\\cucumberproject\\src\\main\\java\\com\\projectcucumber\\configration.proberties");
     FileInputStream fis = new FileInputStream(f);
     Properties p = new Properties();
     p.load(fis);
	
}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		
		String password = p.getProperty("password");
		return password;
		
	}
	
	
	
	
}
