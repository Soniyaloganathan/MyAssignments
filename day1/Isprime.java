package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=53;
		boolean number=false;
		for(int i=2;i<=n/2;++i)
		{

		if(n%i==0)
		{
			number=true;
			break;
		}
		 if(!number)
		
			System.out.println("the given number is primenumber");
	
          else
			System.out.println("The given number is not a primenumber");
		
	}

}
}