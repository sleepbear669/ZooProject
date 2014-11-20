package ac.jejunu.gom;

public class Robot implements Life {
	private String name;
	private int age;

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	Robot(String name) {
		this.name = name;
		age = 0;
	}

	public void eat() {
		System.out.println("Robot Energy charging");
	}

	public void getOlder() {
		this.age += 1;
	}

	@Override
	public String toString() {
		return "Robot's name is " + name + " Age is " + age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
