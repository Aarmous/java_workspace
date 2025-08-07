package ch07.sec03;

public class ControllableDemo2 {

	public static void main(String[] args) {
		Controllable[] controllables = { new TV(), new Computer(), new NoteBook() };

		for (Controllable controllable : controllables) {
			controllable.turnOn();
			controllable.turnOff();
			controllable.repair();
		}

	}

}
