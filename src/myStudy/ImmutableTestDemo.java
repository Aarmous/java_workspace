package myStudy;

public class ImmutableTestDemo {

	public static void main(String[] args) {
		Address a = new Address("서울");
//		Address b = new Address("서울");
		Address b = a;
//		b.setValue("부산");

		System.out.println(a.getValue());
		System.out.println(b.getValue());

	}

}

class Address {
	private final String value;

	public Address(String value) {
		this.value = value;
	}

//	public void setValue(String value) {
//		this.value = value;
//	}

	public String getValue() {
		return value;
	}
}
