package ac.jejunu.gom;
import java.util.ArrayList;


public class Zoo implements Manage {
	private ArrayList<Life> zooMember;

	Zoo() {
		zooMember = new ArrayList<Life>();
	}

	public void receive(String type, String name) {
		if (type.equals("bear")) {
			Life bear = new Bear(name);
			zooMember.add(bear);
		} else if (type.equals("cat")) {
			Life cat = new Cat(name);
			zooMember.add(cat);
		} else if (type.equals("dog")) {
			Life dog = new Dog(name);
			zooMember.add(dog);
		} else if (type.equals("lion")) {
			Life lion = new Lion(name);
			zooMember.add(lion);
		} else if (type.equals("owl")) {
			Life owl = new Owl(name);
			zooMember.add(owl);
		} else if (type.equals("robot")) {
			Life robot = new Robot(name);
			zooMember.add(robot);
		} else {
			System.out.println("잘못적음");
			return;
		}
	}

	public void memberInformation() {
		System.out.println("==========");
		System.out.println("Zoo member information");
		System.out.println("==========");
		System.out.println("<==========>");
		for (int i = 0; i < zooMember.size(); i++) {
			System.out.println(zooMember.get(i).toString());
		}
		System.out.println("<==========>");
	}

	public void nextYear() {
		System.out.println("==========");
		System.out.println("One Year Later");
		System.out.println("==========");
		for (int i = 0; i < zooMember.size(); i++) {
			zooMember.get(i).getOlder();
		}
	}

	public boolean checkAge(int index) {
		if (!(zooMember.get(index) instanceof Robot)
				&& ((Animal) zooMember.get(index)).getAge() > 5) {
			return true;
		}
		return false;
	}

	public ArrayList<Animal> fiveAgeAnimal() {
		ArrayList<Animal> fiveAge = new ArrayList();
		Animal temp = new Animal();
		for (int i = 0; i < zooMember.size(); i++) {
			if (!(zooMember.get(i) instanceof Robot) && checkAge(i)) {
				temp = ((Animal) zooMember.get(i));
				fiveAge.add(temp);
			}
		}
		
		synchronized (zooMember) {
			zooMember.removeAll(fiveAge);
		}
		
		return fiveAge;
	}

	@Override
	public void feeding() {
		System.out.println("==========");
		System.out.println("Zoo Meal Time");
		System.out.println("==========");
		for (int i = 0; i < zooMember.size(); i++) {
			zooMember.get(i).eat();
		}

	}
}
