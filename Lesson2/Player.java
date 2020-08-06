// class creating Players
public class Player {
	private String name;
	private int number;

	public Player(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}