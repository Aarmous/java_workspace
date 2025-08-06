package ch07.sec03;

public class TV implements Controllable, RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("Remote로 TV를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("Remote로 TV를 끈다.");
	}

}

class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("Computer를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끈다.");
	}

}

class NoteBook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("NoteBook은 가방 안에 있다.");
	}

	@Override
	public void turnOn() {
		System.out.println("NoteBook을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("NoteBook을 끈다.");
	}

}