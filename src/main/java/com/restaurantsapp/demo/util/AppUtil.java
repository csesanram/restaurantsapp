/**
 * 
 */
package com.restaurantsapp.demo.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.restaurantsapp.demo.pojo.CustomerInformation;

/**
 * @author User
 *
 */
public class AppUtil {

	/**
	 * @param args
	 */
	
	//class/static variable define
	//public final static String str = "welcome";
	public static String str = "welcome";
	
	public static void main(String[] args) {
		str = "edited";
		System.out.println(str);
		// TODO Auto-generated method stub

		//System.out.println(manipulateStr("c"));
		
		/*CustomerInformation customerInformation = new CustomerInformation();
		customerInformation.setFirstName("sadfasd");
		customerInformation.setLastName("sassadf");
		customerInformation.setPhoneNo(777);
		customerInformation.setEmailId("email@abv.com");
		
		// busines logic  
		if(customerInformationValidation(customerInformation)) {
			System.out.println("eeverything is fine,, we are alow to access our systemm.. all the input value got validated");
		} else {
			System.out.println("input validatation got failed.. please check your input/verify your field...");
		}*/
		
		
		/*try {
			fileOpen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*int x = 0;
		int y = 10;
		
		int z = y/x;
		
		System.out.println(z);*/
		
		/*try {
			checkAge(17);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// uncomments ctrl+shift+/
		/*String a = "welcome";
		String b = " to java class";
		String c = a + b;
		System.out.println(c);
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("welcome");
		stringBuffer.append(" to java class");
		
		System.out.println(stringBuffer);
		
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("welcome");
		stringBuilder.append(" to java class");
		
		System.out.println(stringBuilder);*/
		
		System.out.println("Today Date and Time::"+getTodayDate());
		
		char ch ='a';
		char[] charArray = {'a','b','c','d'};
		
		System.out.println(ch);
		
		for (char c : charArray) {
			System.out.println(c);
		}
		
		int[] intArrays = {1,2,3,4,5,234,234,234};
		
		for (int a : intArrays) {
			System.out.println(a);
		}
		
		double[] doubleArray = {1.9,2.3,3.2};
		
		for (double d : doubleArray) {
			System.out.println(d);
		}
		
		for (int i =0; i<doubleArray.length; i++) {
			System.out.println(i+"  :  "+doubleArray[i]);
		}
		
		Integer x = 5; // boxes int to an Integer Object
		
		x = x + 10; //unboxes the Integer to a int
		
		int y = x;
		System.out.println(x.toString());
		
		String inputValue = "cattie cat cat";
		String findValue = "\\bcat\\b";
		regXvalue(inputValue, findValue);
		
		OuterClass outClassObj = new OuterClass();
		
		outClassObj.displayInnnerClass();
				
	}

	public static String manipulateStr(String str) {
		if (str.contains("a")) {
			return str.replace(str, "b");
		} else if (str.contains("b")) {
			return str.replace(str, "a");
		} else {
			return str;
		}
	}

	public static Boolean customerInformationValidation(CustomerInformation customerInformation) {

		Boolean isValidationSuccess = Boolean.TRUE;
		if (customerInformation.getPhoneNo() == "0") {
			System.out.println("I am failing beacuse phone no is zero");
			isValidationSuccess = Boolean.FALSE;
		} else if (customerInformation.getFirstName() == null || "".equals(customerInformation.getFirstName())) {
			System.out.println("I am failing beacuse of fistName may be is NULL OR empty");
			isValidationSuccess = Boolean.FALSE;
		} else if (customerInformation.getLastName() == null || "".equals(customerInformation.getLastName())) {
			System.out.println("I am failing beacuse of lastName may be is NULL OR empty");
			isValidationSuccess = Boolean.FALSE;
		} else if (customerInformation.getEmailId() == null || "".equals(customerInformation.getEmailId())) {
			System.out.println("I am failing beacuse of emailId may be is NULL OR empty");
			isValidationSuccess = Boolean.FALSE;
		}

		return isValidationSuccess;
	}
	
	public static void fileOpen() throws IOException {
		FileReader fileReader = new FileReader("c:\\rr\\test.txt");
		BufferedReader fileInput = new BufferedReader(fileReader);
		
		for (int i = 0; i<3; i++) {
			System.out.println(fileInput.readLine());
		}
	}
	
	public static void checkAge(int age) throws CustomerException {
		if (age<18) {
			throw new CustomerException("Not eligible for enroll registration progress");
		} else {
			System.out.println("i am eligible");
		}
	}
	
	public static String getTodayDate() {
		String todayDateStr = new String();
		// Instantiate a Date Object
		Date date = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy 'at' hh:mm a");
		todayDateStr = ft.format(date);
		
		return todayDateStr;
	}
	
	public static void regXvalue(String inputValue, String findValue) {
		System.out.println(str);
		Pattern p = Pattern.compile(findValue);
		Matcher m = p.matcher(inputValue);
		
		int count = 0;
		
		while(m.find()) {
			count++;
			/*System.out.println("Match number::" + count);
			//System.out.println("Start() "+m.start());
			//System.out.println("Start() "+m.end());
*/		}
		System.out.println("Match number::" + count);
	}
}
