public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wereWolf = new Wolf();
		
		wereWolf.setSex("male");
		wereWolf.setNickname("Fenrir");
		wereWolf.setColor("grey");
		wereWolf.setWeight(1000);
		wereWolf.setAge(3000);

		System.out.println("Wolf sex is " + wereWolf.getSex());
		System.out.println("Wolf nickname is " + wereWolf.getNickname());
		System.out.println("Wolf color is " + wereWolf.getColor());
		System.out.println("Wolf weight is " + wereWolf.getWeight());
		System.out.println("Wolf age is " + wereWolf.getAge());
		}
}