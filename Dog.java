/* CodeAcademy's Learn Java course.
Create a fully functional Dog class for the section "Object Oriented Java"
Author Yiriandur - date October 08, 2017
*/

package noName;

class Dog {

  //using instance variable to model Dog after real dogs
  int age;
  
  //added class constructor for Dog
	public Dog(int dogsAge) {
  
    age = dogsAge;
    
  }
  
  /*
  A method (pre-defined set of instructions) to instruct the class to perform actions e.g. print about the object(s). 
  The void keyword indicates no value should be returned after executing the logic in the method.
  If we do want the method to return a value after it finishes running, we specify the return-type; using data type keywords such as int, char, boolean etc.
  */
  public void bark() {
    
    //print woof with this method
    System.out.println("Woof!");
    
  }
  
  //second method called run
  public void run(int feet) {
    
    System.out.println("Your dog ran " + feet + " feet!");

	}
  
  //third method with a return type of int
  public int getAge() {
    
    return age;
    
  }

	//a main method, built in.
	public static void main(String[] args) {
    
    //create a dog object inside the main method
    Dog spike = new Dog(10);
    //call the bark-method on spike
    spike.bark();
    //call the run method on spike with an int parameter of choice
    spike.run(100);
    //set an int variable spikeAge to the value returned by spike.getAge() and print;
    int spikeAge = spike.getAge();    
    System.out.println(spikeAge);

	}

}