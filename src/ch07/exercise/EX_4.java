package ch07.exercise;

public class EX_4 {

	static void speak(Talkable talkable) {
		talkable.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}

interface Talkable {
	void talk();
}

class Korean implements Talkable {

	@Override
	public void talk() {
		System.out.println("안녕하세요!");
	}

}

class American implements Talkable {

	@Override
	public void talk() {
		System.out.println("Hello!");
	}

}
