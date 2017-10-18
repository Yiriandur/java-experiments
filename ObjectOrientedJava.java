/* Object oriented Java (concepts) - Yiriandur, oct 2017

Concepts within object oriented programming
1) Encapsulation
2) Inheritance
3) Polymorphism

- An object is an instance of a class.
- Encapsulation provides the security that keeps data and methods safe from inadvertent changes.
- Inheritance is a parent-child relationship of a class which is mainly used for code reusability.
- Polymorphism definition is that Poly means many and morphos means forms.
- Using abstraction one can simulate real world objects.
- Abstraction provides advantage of code reuse
- Abstraction enables program open for extension
*/

//Encapsulation
package javaconcept;  
public class Mobile {     
    private String manufacturer;  
    private String operating_system;  
    public String model;  
    private int cost;  
    //Constructor to set properties/characteristics of object  
    Mobile(String man, String o,String m, int c){  
        this.manufacturer = man;  
        this.operating_system=o;  
        this.model=m;  
        this.cost=c;  
    }  
    //Method to get access Model property of Object  
    public String getModel(){  
        return this.model;  
    } 
    //Add other methods to get access to other properties  
}  

//Inheritance
package javaconcept;  
public class Android extends Mobile{  
        //Constructor to set properties/characteristics of object  
        Android(String man, String o,String m, int c){  
                super(man, o, m, c);  
            }  
        //Method to get access Model property of Object  
        public String getModel(){  
            return "This is Android Mobile- " + model;  
        }  
}  

package javaconcept;  
public class Blackberry extends Mobile{  
    //Constructor to set properties/characteristics of object  
    Blackberry(String man, String o,String m, int c){  
                    super(man, o, m, c);  
                }  
    public String getModel(){  
        return "This is Blackberry-"+ model;  
    }  
}  

//Polymorphism method 1, Static Polymorphism (compile time polymorphism/ Method overloading)
package javaconcept;  
class Overloadsample {  
    public void print(String s){  
        System.out.println("First Method with only String- "+ s);  
    }  
    public void print (int i){  
        System.out.println("Second Method with only int- "+ i);  
    }  
    public void print (String s, int i){  
        System.out.println("Third Method with both- "+ s + "--" + i);  
    }  
}  
public class PolymDemo {  
    public static void main(String[] args) {  
        Overloadsample obj = new Overloadsample();  
        obj.print(10);  
        obj.print("Amit");  
        obj.print("Hello", 100);  
    }  
} 

//Polymorphism method 2, Dynamic Polymorphism (run time polymorphism/ Method Overriding)
package javaconcept;  
public class OverridingDemo {  
    public static void main(String[] args) {  
        //Creating Object of SuperClass and calling getModel Method  
        Mobile m = new Mobile("Nokia", "Win8", "Lumia",10000);  
        System.out.println(m.getModel());  
        //Creating Object of Sublcass and calling getModel Method  
        Android a = new Android("Samsung", "Android", "Grand",30000);  
        System.out.println(a.getModel());  
        //Creating Object of Sublcass and calling getModel Method  
        Blackberry b = new Blackberry("BlackB", "RIM", "Curve",20000);  
        System.out.println(b.getModel());  
    }  
}  

//Abstraction
package javaconcept;  
public abstract class VehicleAbstract {  
    public abstract void start();  
    public void stop(){  
        System.out.println("Stopping Vehicle in abstract class");  
    }  
}  
class TwoWheeler extends VehicleAbstract{  
    @Override  
    public void start() {  
        System.out.println("Starting Two Wheeler");       
w   }     
}  
class FourWheeler extends VehicleAbstract{  
    @Override  
    public void start() {  
        System.out.println("Starting Four Wheeler");  
    }  
}  

package javaconcept;  
public class VehicleTesting {  
    public static void main(String[] args) {  
        VehicleAbstract my2Wheeler = new TwoWheeler();  
        VehicleAbstract my4Wheeler = new FourWheeler();  
        my2Wheeler.start();  
        my2Wheeler.stop();  
        my4Wheeler.start();  
        my4Wheeler.stop();  
    }  
}  
 
