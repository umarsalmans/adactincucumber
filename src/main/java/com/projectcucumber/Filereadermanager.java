package com.projectcucumber;

import java.io.IOException;

public class Filereadermanager {
	
	private Filereadermanager() {
		
	}
	
public Configuration_Reader getInstanceCR() throws IOException {
	Configuration_Reader cr = new Configuration_Reader();
	return cr ;
}	
	
	public Filereadermanager getInstanceFrm() {
		Filereadermanager frm =  new Filereadermanager();
		return frm;
	}
	
	
	
	
	

}
