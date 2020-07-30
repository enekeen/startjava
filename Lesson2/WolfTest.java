public class WolfTest {
	public static void main(String[] args) {
		Wolf wereWolf = new Wolf();
		
		wereWolf.sex = "male";
		wereWolf.nickname = "Fenrir";
		wereWolf.color = "grey";
		wereWolf.weight = 1000;
		wereWolf.age = 3000;

		System.out.println("Wolf sex is " + wereWolf.sex);
		System.out.println("Wolf nickname is " + wereWolf.nickname);
		System.out.println("Wolf color is " + wereWolf.color);
		System.out.println("Wolf weight is " + wereWolf.weight);
		System.out.println("Wolf age is " + wereWolf.age);
		
		wereWolf.walk();
		wereWolf.sit();
		wereWolf.run();
		wereWolf.howl();
		wereWolf.hunt();
	}
}