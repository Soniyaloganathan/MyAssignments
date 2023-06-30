package day2assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		//int count=0;
		Arrays.sort(arr);
		for(int i=1;i<=arr.length;i++)
		{
		//count=i+1;
			if(i!=arr[i-1])
			{
		
				System.out.println(i);
				break;
			}
		}
	}
	  	

	}


