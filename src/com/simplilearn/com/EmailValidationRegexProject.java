package com.simplilearn.com;

import java.util.ArrayList;
import java.util.regex.*;

public class EmailValidationRegexProject {
	
	public static void main(String[] args) {
		
		ArrayList<String> emails= new ArrayList<String>();
		emails.add("shivam@domain.com");
		emails.add("shivampandey@domain.co.in");
		emails.add("Prashant@domain.com");
		emails.add("shivamishra@domain.com");
		emails.add("username@yahoo.corporate.in");
		//Invalid emails
		emails.add(".shivam@yahoo.com");
		emails.add("shivampandey@yahoo.com.");
		emails.add("Prashant@yahoo..com");
		emails.add("shivamishra54@domain.c");
		emails.add("username@yahoo.corporate");

		
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]"
				+ "+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		  Matcher matcher = pattern.matcher(email);
		  System.out.println(email +" : "+ matcher.matches());
		}        

		}

}
