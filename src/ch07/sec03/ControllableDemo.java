package ch07.sec03;

public class ControllableDemo {

	public static void main(String[] args) {
		TV tv = new TV();
		Controllable.reset();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();

		Computer com = new Computer();
		Controllable.reset();
		com.turnOn();
		com.turnOff();
		com.repair();

		NoteBook nb = new NoteBook();
		nb.inMyBag();
		Controllable.reset();
		nb.turnOn();
		nb.turnOff();

	}

}
