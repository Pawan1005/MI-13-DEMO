package ArrayDemo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] z = new int[5];
		int pos = 0 , neg = 0 , odd = 0 , even = 0 , zero=0;
		
		for(int i = 0; i< z.length; i++)
		{
			System.out.println("Print the value of z["+i+"]");
			z[i] = sc.nextInt();
			
			if(z[i]>0)
			{
				pos++;
			}
			else if(z[i]<0)
			{
				neg++;
			}
			else 
			{
				zero++;
			}	
			if(z[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;	
			}
			}
			System.out.println("Positive:"+pos+ "\nNegative:"+neg+ "\nZero:"+zero+ "\nodd:" +odd+ "\neven :"+even);
		
	}

}
