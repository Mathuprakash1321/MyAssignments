package week3.day1;

public class LearnConstructor {
	int a;
	String s;
	
	public LearnConstructor()
	{
		System.out.println("No argument constructor");
	}
	public LearnConstructor(int a, String s)
	{
		this();
		System.out.println("Parameterized constructor");
		this.a=a;
		this.s=s;
		
	}
	public LearnConstructor(int b)
	{
		this(1, "happy");
		
		System.out.println(b);
		
	}
	public void add() {
		System.out.println("add");
	}

	public static void main(String[] args) {
		LearnConstructor lc=new LearnConstructor();
		System.out.println(lc.a);
		System.out.println(lc.s);
		
	}

}
