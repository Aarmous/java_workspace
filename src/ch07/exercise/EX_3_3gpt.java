package ch07.exercise;

import java.util.Arrays;

class Book implements Comparable<Book> {
	private int price;

	public Book(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [price =" + price + "]";
	}

	@Override
	public int compareTo(Book other) {
		return Integer.compare(this.price, other.price);
	}
}

public class EX_3_3gpt {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book(15000);
		books[1] = new Book(50000);
		books[2] = new Book(20000);

		System.out.println("정렬전");
		for (Book book : books) {
			System.out.println(book);
		}

		Arrays.sort(books); // Book 클래스에서 정의한 compareTo에 따라 정렬

		System.out.println("정렬후");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}