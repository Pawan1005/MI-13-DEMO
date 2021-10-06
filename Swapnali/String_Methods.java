package SwitchCase;

import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the String Operations");
	
	String str1 = sc.nextLine();
	
	System.out.println("1 : Length of String");
	System.out.println("2 : Palindrome or not");
	System.out.println("3 : Substring of String");
	System.out.println("4 : Concatnation of String");
	System.out.println("5 : Check index of String");
	System.out.println("6 : Check String is equal or not");
	System.out.println("7 : Convert String in Lowercase");
	System.out.println("8 : Convert String in Uppercase");
	
	int n = sc.nextInt();
	
	switch(n)
	{
	case 1:
		System.out.println("Length of String is : " + str1.length());
		break;
	
	case 2 : 
		String rev = "";
		int length = str1.length();
		for(int i = length- 1; i>=0; i--)
				
			rev = rev + str1.charAt(i);
		
		if(str1.equals(rev))
			System.out.println("String is Palindrome");
		
		else
			System.out.println("String is  Not Palindrome");	
		break;
	
	case 3 : 
		System.out.println(str1.substring(2,4));
		break;
		
	case 4 :
		String str2;
		
		System.out.println("Enter Secong String");
		
		Scanner sc1 = new Scanner(System.in);
		str2 = sc1.nextLine();
		
		String str3 = str1.concat(str2);
		System.out.println("After : +str3");
		break;
		
	case 5 : 
		System.out.println("Enter character");
		
		Scanner sc2 = new Scanner(System.in);
		String ch = sc2.nextLine();
		
		System.out.println("Index of String :" + str1.indexOf(ch));
		break;
		
	case 6 :
		String str4;
		
		System.out.println("Enter secong String");
		
		Scanner sc3 = new Scanner(System.in);
		str4 = sc3.nextLine();
		
		if(str1.equals(str4))
			System.out.println("Strings are equal");
		
		else
			System.out.println("Strings are  not  equal");
		break;
		
	case 7 : 
		System.out.println("String After Conversion " +str1.toLowerCase());
		break;
		
	case 8 : 
		System.out.println("String After Conversion " +str1.toUpperCase());
		break;	

	}
	}
}
