public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger();
		Jaeger chernoAlpha = new Jaeger();

		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("Mark-5");
		strikerEureka.setHeight(76.2);
		strikerEureka.setWeight(1.850);
		strikerEureka.setSpeed(10);
		strikerEureka.setStrength(10);
		strikerEureka.setArmor(9);

		chernoAlpha.setModelName("Cherno Alpha");
		chernoAlpha.setMark("Mark-1");
		chernoAlpha.setHeight(85.34);
		chernoAlpha.setWeight(2.412);
		chernoAlpha.setSpeed(3);
		chernoAlpha.setStrength(10);
		chernoAlpha.setArmor(10);

		System.out.println(strikerEureka.getModelName());
		System.out.println(chernoAlpha.getMark());
		chernoAlpha.setSpeed(5);
		System.out.println(chernoAlpha.getSpeed());
		strikerEureka.setWeight(2.777);
		System.out.println(strikerEureka.getWeight());
	}
}