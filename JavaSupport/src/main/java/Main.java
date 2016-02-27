import java.util.List;

import com.saothienhat.projects.tracnghiem.TestUtils;

public class Main
{

    public static void main( String[] args )
    {
//        String filePath = "D:\\MY_PROJECTs\\SVN_CLIENT\\CordovaPhonegap\\Tester\\05_DATA\\DataForDB\\import.txt";
    	String sourceFileName = "asdas";
    	String filePath = "D:\\Emails\\" + sourceFileName;
//        TestUtils.readFile1( filePath );
    	
    	// For Email
//    	runForEmails();
    	
    	
    }

	private static void runForEmails()
	{
		// Get list of email and write to file
		String sourceFileName = "VN_Email_6.txt";
    	String sourcefilePath = "D:\\Emails\\" + sourceFileName;
		String targetFilePath = "D://Emails//Results//" + sourceFileName;
    	List<String> emailsFromFile = TestUtils.getEmailsFromFile(sourcefilePath, sourceFileName );
    	//TestUtils.writeEmail(emailsFromFile, targetFilePath);
		
	}

}
