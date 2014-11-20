package ac.jejunu.gom;
public class Lion extends Animal {
	Lion(){
		
	}
	Lion(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Lion eat meat");
	}

	public String toString() {
		return "Lion's name is " + name + " Age is " + age;
	}
}
