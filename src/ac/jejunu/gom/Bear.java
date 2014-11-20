package ac.jejunu.gom;
public class Bear extends Animal {
	Bear() {
	}

	Bear(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("bear eat honey");
	}

	public String toString() {
		return "Bear's name is " + name + " Age is " + age;
	}
}
