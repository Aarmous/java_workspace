package chapter04;

public class ClassDiagram {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.introduce();

	}

}

class Animal {
	public int age;
	public String gender;

	public void isMammal() {

	}

	public void introduce() {

	}
}

class Duck extends Animal {
	public String beakColor = "yellow";

	public void swim() {

	}

	public void quak() {

	}
}

class Fish extends Animal {
	public int sizeFt;

	public void swim() {

	}
}
