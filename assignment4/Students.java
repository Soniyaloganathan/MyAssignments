package assignment4;

public class Students {

	int id=123;
	String name="soniya";
	String email="l.soniyasoni333@gmail.com";
	String phoneNumber="9176603396";
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);

	}
	
	public void getStudentInfo(int id,String name) {
		
		System.out.println(id+name);
		

	}
	
	public void getStudentInfo(String email,String phoneNumber ) {
		System.out.println(email+phoneNumber);
	}
	public static void main(String[] args) {
		Students su=new Students();
		su.getStudentInfo(123);
		su.getStudentInfo(123, "soniya");
		su.getStudentInfo("l.soniyasoni333@gmail.com", "9176603396");
	}
}
