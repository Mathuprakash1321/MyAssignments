package week1.day2;

public class FindFibonacci {

	public static void main(String[] args) {
		int range =8;
		int firstNum =0;
		int secnum=1;
		int sum;
		System.out.print(firstNum +"," +" " );
		
		for (int i = 1; i <range; i++) {
			
			
			sum=firstNum+secnum;
			firstNum=secnum;
			secnum=sum;
			
			System.out.print(firstNum +"," +" ");
		}
		
	}

}
