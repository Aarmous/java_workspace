package myStudy.TextbookTest;

public class Ch08_06 {

	public class SoundableExample {
		public static void printSound(Soundable soundable) {
			System.out.println(soundable.sound());
		}
	}

	public static void main(String[] args) {
		SoundableExample.printSound(new Cat());
		SoundableExample.printSound(new Dog());
	}
}

interface Soundable {
	public String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}