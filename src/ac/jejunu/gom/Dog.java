package ac.jejunu.gom;
public class Dog extends Animal {
	Dog() {
		
	}
	Dog(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Dog eat bone");
	}
	
	public String toString() {
		return "Dog's name is " + name + " Age is " + age;
	}
}
