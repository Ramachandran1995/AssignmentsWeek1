package week1assignments;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6,7,8};
		int length = arr . length ;
		
		Arrays.sort(arr) ;
		
		for (int i =1 ; i<length ; i++) {
			
			if(i != arr[i-1] )
			{
				System.out.println("1st Missing number is");
				System.out.println(i);	
				break;
			}
			
		
		}
			
		
		 
	}
}
