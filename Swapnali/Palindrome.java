package ArrayDemo;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) 
	{
		String org = "",rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String");
		org = sc.nextLine();
		
		for(int i = (org.length( )- 1); i>=0; i--)
		{
				rev = rev + org.charAt(i);
		}
		
		if(org.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		
		else
		{
			System.out.println("String is  Not Palindrome");	
		}
	}

}
