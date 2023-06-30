package day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
	    StringBuffer str1=new StringBuffer();//stringbuffer is a class name
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 str1=str1.append(str.charAt(i));
	     }
	    		if(str.equalsIgnoreCase(str1.toString()))
	    		{
	    			System.out.println("Print given string is palindrome");
	    		}
	    		else
	    		{
	    			System.out.println("Print given number is not a palindrome");

	    		}
	}
}