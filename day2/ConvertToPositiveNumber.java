package week1.day2;

public class ConvertToPositiveNumber {

	public static void main(String[] args) {
		int number=-30;
		
		if(number<0) {
			System.out.println("It is a negative number");
		}
		else 
		{
			System.out.println("It is a positive number");
		}
		
		number =(-number);			
		System.out.println("Negative number is converted into positive number :"+number);
	}

	}

	

	


