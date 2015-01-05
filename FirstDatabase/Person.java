
public class Person{
	
	// private members
	private int[] myId = new int[10];
	private int nextId = 0;
	private String[] myName = new String[10];
	private int[] myAge = new int[10];
	
	// constructors
	public Person(){
	
	}
	
	// public methods
	public void store(String name, int age){
		this.nextId = myId[nextId];
		this.myName[nextId] = name;
		this.myAge[nextId] = age;
		this.nextId = nextId + 1;
		System.out.println("Next ID: " + nextId);
	}
	
	public void printNameList(){
		for(int i = 0; i < 10; i++){
			System.out.println(myName[i]);
		}
	}
	
	public void displayInfo(int displayId){
		
		System.out.println("Subject ID: " + myId[displayId] + "\nName: " + myName[displayId] + "\nAge: " + myAge[displayId]);
		
	}
}
