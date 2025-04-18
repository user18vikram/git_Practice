package advanced;

public class Constructors {
	
	public Constructors()
	{
		System.out.println("Default Constructor()  ||  Constructor with No Arguments");
	}
	
	public Constructors(String s)
	{
		System.out.println("Parameterized Constructor()  ||  Constructor with Arguments");
	}
	
	public static void main(String[] args) {
		
		Constructors c = new Constructors();
		
		Constructors c2 = new Constructors("call him");
		
	}

}
