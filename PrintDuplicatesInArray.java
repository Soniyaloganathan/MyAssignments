package day2assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//Arrays.sort(arr);
		int count=arr.length;
		System.out.println("The length of the given string is:"+ count);
		for(int i=0;i<=arr.length-1;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			
				if(arr[i]==arr[j])
				{ 
					
				
					System.out.println("The repeated number is :"+ arr[i]);
				
			}          
		}

	}
}


