package basics;

public class Ternary_Operator {

	public static void main(String[] args) {
		
		int a = 10, b = 20;

        // Using ternary operator to find the minimum value
		
        int min = (a < b) ? a : b;

        System.out.println("The minimum value is: " + min);
		
        
        int num = 7;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is: " + result);
        
	}
	
}
