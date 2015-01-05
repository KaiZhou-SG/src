public class Person{
	
  // private members
  // private int [] myId = new int[10];
  private int nextId; // = 0;
  private String [] myName;// = new String[10];
  private int [] myAge; // = new int[10];

  // constructors
  public Person(){
    nextId = 0;
    myName = new String[10];
    myAge = new int[10];
  }
	
  // public methods
  public void store(Person person, String name, int age){
    System.out.println("When entering store(), nextId = " + person.nextId);
    // this.nextId = myId[nextId];
    // myId[nextId] = this.nextId;
    person.myName[nextId] = name;
    person.myAge[nextId] = age;
    person.nextId = person.nextId + 1;
    System.out.println("Now nextId = " + person.nextId);
    // System.out.println("myId[" + nextId + "] = " + myId[nextId]);
    System.out.println("name: " + person.myName[nextId-1] + " age: " +
      person.myAge[nextId - 1]);
    printNameList(person);
  }
	
  public void printNameList(Person person){
    for(int i = 0; i < 10; i++){
      System.out.println(person.myName[i]);
  }
}
	
  public void displayInfo(Person person, int displayId){	
    System.out.println("Subject ID: " + /*myId[displayId] +*/ "\nName: " + person.myName[displayId] + "\nAge: " + person.myAge[displayId]);
		
  }
}
