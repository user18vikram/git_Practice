package basics;

public class Methods {
	
	public static void sm()
	{
		System.out.println("user-defined static method()");
	}
	
	public void m1()
	{
		System.out.println("user-defined instance method() | non-static method()");
	}

	public void m2(int i)
	{
		System.out.println("user-defined parameterized method()");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main method() : a pre-defined method");
		
		System.out.println();
		
		// calling static method
		
		sm();
		Methods.sm();
		
		Methods m = new Methods();
		
		System.out.println();
		
		m.m1();
		m.m2(10);
		
	}
	
	
}

