package ArrayDemo;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) 
	{
		int arr[] = new int[] {25,14,56,15,36,56,77,18,29,49};
		int index = 2 , newno = 5;
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		
		for(int i = arr.length-1 ; i > index ; i--)
			{
			arr[i] = arr[i-1];
			}
		
		arr[index] = newno;
		System.out.println("New Array : " +Arrays.toString(arr));
	}

}
