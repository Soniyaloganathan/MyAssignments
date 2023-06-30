package day2assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int[] num1= {3,2,11,4,6,7};
		int[] num2= {1,2,8,4,9,7};
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num2.length;j++)
			{	
				//System.out.println("Print the num1:" +num1);
			    //System.out.println("print the num2:" +num2);
		
			if(num1[i]==num2[j])
			{
				System.out.println(num1[i]);
			}
			}
		}
		
	}
}