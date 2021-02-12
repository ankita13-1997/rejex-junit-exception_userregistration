package com.test;

import static org.junit.Assert.assertEquals;

//import junit.framework.Test;

//import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void validateFirstName_WhenProper_ShouldReturnTrue() {
		//App app=new App();
		boolean result= App.CheckName();
		assertEquals(true, result);
 
}
	
	
	@Test
	public void validateFirstName_WhenProper_ShouldReturnFalse() {
		//App app=new App();
		boolean result= App.CheckName();
		assertEquals(false, result);
		}
	
	
	@Test
	public void validateLastName_WhenProper_ShouldReturnTrue() {
		//App app=new App();
		boolean result= App.CheckLName();
		assertEquals(true, result);
 
}
	
	
	@Test
	public void validateLastName_WhenProper_ShouldReturnFalse() {
		//App app=new App();
		boolean result= App.CheckLName();
		assertEquals(false, result);
		}
	
	
	
	@Test
	public void validatePhone_WhenProper_ShouldReturnTrue() {
		//App app=new App();
		boolean result= App.checkno();
		assertEquals(true, result);
 
}
	
	
	
	@Test
	public void validatePhone_WhenProper_ShouldReturnFalse() {
		//App app=new App();
		boolean result= App.checkno();
		assertEquals(false, result);
		}
	
	
	@Test
	public void validateEmail_WhenProper_ShouldReturnTrue() {
		//App app=new App();
		boolean result= App.checkemail();
		assertEquals(true, result);
 
}
	
	
	
	@Test
	public void validateEmail_WhenProper_ShouldReturnFalse() {
		//App app=new App();
		boolean result= App.checkemail();
		assertEquals(false, result);
		}
	
	@Test
	public void validatePassword_WhenProper_ShouldReturnTrue() {
		//App app=new App();
		boolean result= App.checkpassword();
		assertEquals(true, result);
 
}
	
	
	
	@Test
	public void validatePassword_WhenProper_ShouldReturnFalse() {
		//App app=new App();
		boolean result= App.checkpassword();
		assertEquals(false, result);
		}

}
