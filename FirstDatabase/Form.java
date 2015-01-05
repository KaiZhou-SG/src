import java.util.Scanner;

public class Form {
  // private members
  private Scanner input; // = new Scanner(System.in);
  public Person person; // = new Person();
  private String myName;
  private int myAge;
	
  // constructors
  public Form(/*Person person*/){
    input = new Scanner(System.in);
    this.person = new Person();
    myName = "";
    myAge = 0;
  }

  public void StoreForm(){
    System.out.println("Please fill out this form:");
    System.out.print("Name: ");
    myName = input.next();
    System.out.print("Age: ");
    myAge = input.nextInt();

    person.store(person, myName, myAge);
  }
	
}
