package org.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
  public static void generateJvmReport(String jsonpath) {
	
	  File f= new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
	   String p = System.getProperty("user.dir");
	   System.out.println(p);
	  Configuration con= new Configuration(f, "faceboook");
	  con.addClassifications("Domain", "Entertainer");
	  con.addClassifications("Browser", "Chrome");
	  con.addClassifications("Browser version", "112.34");
	  con.addClassifications("OS", "windows");
	  con.addClassifications("Windows version", "10");
    
	  List<String>li= new ArrayList<String>();
	  li.add(jsonpath);
	  
	  ReportBuilder r = new ReportBuilder(li, con);
	  r.generateReports();
     
}
}
