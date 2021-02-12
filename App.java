package com.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import practice.ValidationName;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	
		public static boolean CheckName(){
			
			System.out.println("enter your name");
			System.out.println("please enter the[1] first letter in captical[2]input of min 5 letter and maximum 10 is accepted");
			System.out.println();
			String firstName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(firstName);
			 boolean m1=m.matches();
			 System.out.println(m1);
			
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your name "+firstName);
			 }
			 return m1;
		}
		
	public static boolean CheckLName(){
			
			System.out.println("enter your name");
			System.out.println("please enter the[1] first letter in captical[2]input of min 5 letter and maximum 10 is accepted");
			System.out.println();
			String lastName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(lastName);
			 boolean m1=m.matches();
			 System.out.println(m1);
			
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your name "+lastName);
			 }
			 return m1;
		}
		public static boolean checkno() {
			// TODO Auto-generated method stub
			    System.out.println("enter the phone number");
			    System.out.println("number should valid its country code as +91 and must be of 9 digit number");
			    String phone=sc.next();
			    String regex="[91]{2}[0-9]{9}";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(phone);
				 boolean m1=m.matches();
				 System.out.println(m1);
				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs in name please renter in the correct format");
					 
				 }
				 
				 else
				 {
					 System.out.println("your contact number "+phone);
				 }
				 return m1;
			
		}
		
		
		public static boolean checkemail()
		{
			System.out.println("Enter your Email");
			System.out.println("[1]email must have domain name and .with it [2] must have a @ in Your input");
			String email=sc.next();
			    String regex="[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(email);
				 boolean m1=m.matches();
				 System.out.println(m1);
			
				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs for email please renter in the correct format");
					 
				 }
				 
				 else
				 {
					 System.out.println("your email is "+email);
				 }
				return m1;
		}	
		
		
		public static boolean checkpassword() 
		{
			// TODO Auto-generated method stub
			System.out.println("enter the password");
			System.out.println("password must have atleast 1.one upper case 2.lower case 3.one special character like @ # & $"
					            + " 4. 1 numberic character 4.length of password minimum be 4 maximum be 10" );
			System.out.println("warning you can only take 5 attempts only");
			 int count=0;
			  boolean m1=true;
			for(int i= 0; i<5 ; i++)
			{
			    String password=sc.next();
			    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(password);
				  m1=m.matches();
				 System.out.println(m1);
				count+=1;

				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs for password please renter in the correct format");
					 System.out.println("you hav used "+count+ " from maximun 5 attempts");
					 continue;
					 
				 }
				 
				 else
				 {
					 System.out.println("your password "+password);
					
					 System.out.println("please Re-enter the correct password");
					 String password2=sc.next();
					 if(password2.contains(password))
					 {
						 System.out.println("you have succesfully set your password and made an account");
						
					 }
					 else
					 {
						 System.out.println("enter the password again");
						 continue;
					 }
					 break;
				 }
				
			}
				
			return m1;  
		}
    /**
     * @param args
     */
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	//new App().CheckName();
    	boolean result=new App().CheckName();
    	if(result==true)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");
    	}
    	
    	new App().CheckLName();
    	
    	boolean result1=new App().checkno();
    	if(result1==true)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");
    	}
    	
    	new App().checkemail();
    	
    	new App().checkpassword();
    }
}
