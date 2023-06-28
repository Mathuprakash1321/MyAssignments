package getmethod.homework;

public class Students {
	//by id & name, by email & phoneNumber

	public void getStudentInfo(int a) {
		System.out.println("Student id :" + a);
	}
	public void getStudentInfo(int a, String n) {
		System.out.println("Student id :" + a + " " + "and Student Name:" +" "+n);

	}
	public void getStudentInfo(String em, String ph) {
		System.out.println("Student Email Id :" +" "+ em + " " +" and Student phone number :" +" " +ph);

	}
	
	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(13);
		info.getStudentInfo(13, "Mathu");
		info.getStudentInfo("mathu@gmail.com", "9876543210");
		
	}
}
