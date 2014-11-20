package ac.jejunu.gom;


public class Animal implements Life {
	protected String name;
	protected int age;

	Animal() {
	}

	Animal(String name) {
		this.name = name;
	}

	public void eat() {
	}

	public String toString() {
		return "";
	}

	public void getOlder() {
		this.age += 1;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String getType(){
		return "Animal";
	}
}
