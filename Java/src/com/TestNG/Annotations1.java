package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1)
	//Its a Test case
    public void gmailApplicationLanch()
    {
	System.out.println("*** GmailApplicationLaunch Successful  ***");
    }
	
	@Test(priority=2)
	public void gmailInBoxTest() {
		
	}
	
}
