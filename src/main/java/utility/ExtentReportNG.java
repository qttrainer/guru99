package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	public static ExtentReports getReport()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";	
		ExtentSparkReporter esr = new ExtentSparkReporter(path);
		esr.config().setReportName("Automation execution result");
		esr.config().setDocumentTitle("Test Result");
		
		 extent = new ExtentReports();
		extent.attachReporter(esr);
		return extent;
		
		
		
	}

}
