package day2assignments;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {

	
		private static Object j;
		private static Object i;

		public static String removeDuplicate(char str[], int n)
		{
			int count=0;
			for(int i =0;i<n;i++)
			{
				for (int j=0;j<i;j++)
			if(str[i]==str[j])
			{
				break;
			}
			}
			
			//int i = 0;
			//int j = 0;
			if(j==i)
			{
				str[count++]=str[(Integer) i];
			}
   
		return String.valueOf(Arrays.copyOf(str,count));
}

public static void main(String[]args)
{
	char str[]= "We learn java basics as part of java sessions in java week1".toCharArray();
	int n=str.length;
	System.out.println(removeDuplicate(str, n));
}
}


