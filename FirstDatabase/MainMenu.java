import java.util.Scanner;

public class MainMenu {
    // private members
    private Scanner input; // = new Scanner(System.in);
    // private Person person; // = new Person();
    private int myChoice;
	
    // constructors
    public MainMenu(){
      input = new Scanner(System.in);
      // person = new Person();
      myChoice = 0;
    }       
    // public functions
    public void start(){
      Form form = new Form(/*person*/);
      while(true){
        System.out.println("What do you wana do? \n<1> Fill out Form. \n<2> Search for person. \n<3> Quit.");
	myChoice = input.nextInt();
	
	if(myChoice == 1){
	  form.StoreForm();  
          System.out.println("-----------------------------------------");
	}
	if(myChoice == 2){
	  System.out.println("-----------------------------------------");
	  form.person.printNameList(form.person); // for debugging only
	  System.out.print("ID: ");
	  int n = input.nextInt();
	  System.out.println("input.nextInt() = " + n); // for debugging only
	  form.person.displayInfo(form.person, n);
		
	}
	if(myChoice == 3){
	  System.exit(0);
	}
      }
    }
}
 
