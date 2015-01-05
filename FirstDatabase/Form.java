import java.util.Scanner;

public class Form {
    // private members
	private Scanner input = new Scanner(System.in);
	private Person person = new Person();
	private String myName;
	private int myAge;
	
	// constructors
	Form(){
		System.out.println("Please fill out this form:");
		System.out.print("Name: ");
		myName = input.next();
		System.out.print("Age: ");
		myAge = input.nextInt();
		
		person.store(myName, myAge);
	}
	
}
