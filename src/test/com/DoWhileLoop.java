package test.com;
import java.util.Scanner;

public class DoWhileLoop {

	
	

	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Cube is "+(number*number*number));
		System.out.println("Enter The Number1");
		 number = input.nextInt();
		
		}
		while(number >= 0);
	System.out.println("have fun");
}
		
	}	

 //do while and while difference is while check condition first and do while is check conditiomn last.
//In do while  when condition is false then statement print ///