package ac.jejunu.gom;
import java.util.ArrayList;

public class Hospital implements Manage{
	private ArrayList<Animal> hospitalMember;
	private int count;
	Hospital(){
		hospitalMember = new ArrayList<Animal>();
		count = 0;
	}
	@Override
	public void feeding() {
		System.out.println("==========");
		System.out.println("hospital Meal Time");
		System.out.println("==========");
		for (int i = 0; i < count; i++) {
			hospitalMember.get(i).eat();
		}
	}
	@Override
	public void nextYear() {
		System.out.println("==========");
		System.out.println("One Year Later");
		System.out.println("==========");
		for (int i = 0; i < count; i++) {
			hospitalMember.get(i).getOlder();
		}
	}
	public void hospitalization(ArrayList<Animal> older) {
		if(!older.isEmpty()){
			System.out.println(older.size() + "Animal Come here");
			for (int i = 0; i < older.size(); i++) {
				hospitalMember.add(older.get(i));
			}
		}
	}
	public void memberInformation() {
		System.out.println("==========");
		System.out.println("Hospital member information");
		System.out.println("==========");
		System.out.println("<==========>");
		for (int i = 0; i < count; i++) {
			System.out.println(hospitalMember.get(i).toString());
		}
		System.out.println("<==========>");
	}
}
