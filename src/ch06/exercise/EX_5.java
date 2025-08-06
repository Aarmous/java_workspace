package ch06.exercise;

public class EX_5 {

	public static void main(String[] args) {
		Phone[] ph = new Phone[3];
		ph[0] = new Phone("황진이");
		ph[1] = new Telephone("길동이", "내일");
		ph[2] = new Smartphone("민국이", "갤러그");

		for (int i = 0; i < 3; i++) {
			Phone phone = ph[i];
			if (phone instanceof Smartphone s) {
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			}

		}

		for (Phone phone : ph) {
			if (phone instanceof Smartphone s) {
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			}
		}

	}

}

class Phone {
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.printf("%s가 통화 중 \n", owner);
	}

}

class Telephone extends Phone {
	private String when;

	public String getWhen() {
		return when;
	}

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	public void autoAnswering() {
		System.out.printf("%s가 부재중이니 %s에 전화요망 \n", owner, when);
	}

}

class Smartphone extends Telephone {
	private String game;

	public String getGame() {
		return game;
	}

	public Smartphone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	public void playGame() {
		System.out.printf("%s가 %s 게임 중 \n", owner, game);
	}

}
