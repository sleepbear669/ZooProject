package ac.jejunu.gom;
import java.util.Scanner;

public class Main {

	static Zoo zoo = new Zoo();
	static Hospital hospital = new Hospital();
	static int action = 0;

	public static void main(String[] args) {
		String commend = new String();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			printMenu();
			commend = scanner.next();
			int key = Integer.parseInt(commend);
			behavior(key);
		}

	}

	private static void printMenu() {
		System.out.println("1 : 입양 2 : 동물 밥주기 3 : 동물원 정보 4 : 병원 정보  ");
	}

	public static void printType() {
		System.out.println("bear , cat , lion, dog, owl, robot ");
	}

	public static void behavior(int key) {

		Scanner scanner = new Scanner(System.in);
		switch (key) {
		case 1:
			printType();
			System.out.print("죵류 : ");
			String type = scanner.next();
			System.out.print("이름 : ");
			String name = scanner.next();
			zoo.receive(type, name);
			break;
		case 2:
			zoo.feeding();
			hospital.feeding();
			break;
		case 3:
			zoo.memberInformation();
			break;
		case 4:
			hospital.memberInformation();
			break;
		case 5:
			zoo.nextYear();
			hospital.nextYear();
			break;
		default:
			return;
		}
		action++;
		if (action % 5 == 0) {
			zoo.nextYear();
			hospital.nextYear();
		}
		hospital.hospitalization(zoo.fiveAgeAnimal());
	}
}
