package ArrayDemo;

public class AverageValue {

	public static void main(String[] args) 
	{
		int n[] = new int[] {10,20,30,40,50};
		int sum = 0 ,avg;
		
		for(int i = 0; i < n.length; i++)
			sum = sum + n[i];
			 avg = sum/n.length;
			
			System.out.println("Average Value : " +avg);
				
	}

}
