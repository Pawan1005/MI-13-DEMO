package ArrayDemo;

public class DuplicateValue {

	public static void main(String[] args) 
	{
		String[] arr = new String[] {"abc" , "bcd" , "abf" , "bcd" , "xyz" , "ssd" , "xyz"};
		
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			for(int j=i+1 ; j < arr.length ; j++)
			{
				if(arr[i].equals(arr[j]) && (i != j) )
				{
					System.out.println("Duplicate Element : " +arr[j]);
				}
					
			}
		}

	}

}
