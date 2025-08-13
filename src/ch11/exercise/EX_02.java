package ch11.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX_02 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println();
		System.out.println(set);

	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%s : %d", name, age);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
