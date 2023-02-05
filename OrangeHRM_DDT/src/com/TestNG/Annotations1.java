package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1)
    public void gmailApplicationLanch()
    {
	System.out.println("*** Gmail ApplicationLaunch Successful  ***");
    }
	@Test(priority=2)
	public void gmailInBoxTest()
	{
		System.out.println(" In Box Functionality Test Executed Successfully");
	}
	@Test(priority=3)
	public void gmailComposemailTest()
	{
		System.out.println("Composemail Functionality Test Executed Successfully");
	}
	@Test(enabled=false)
	public void gmailsentmailTest()
	{
		System.out.println("Sentmail Functionality Test Executed Successfully");
	}
	@Test(priority=4)
	public void gmailDraftTest()
	{
		System.out.println("gmailDraft Functionality Test Executed Successfully");
	}
	@Test(priority=6)
	public void gmailApplicationclose()
	{
		System.out.println(" *** Gmail Application closed Successfully *** ");
	}
}
