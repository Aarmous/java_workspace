package ch07.exercise;

import java.util.Arrays;

public class EX_3_3 {

	public static void main(String[] args) {
//		int[] a = { 3, 2, 5, 4, 1 };
//		System.out.println(a);  // 배열의 주소를 출력 
//		System.out.println(Arrays.toString(a));  // 배열의 내용을 출력 
//		Arrays.sort(a);  // 배열 내용인 숫자를 오름차순으로 정렬시킴 
//		System.out.println(Arrays.toString(a));  // 오름차순으로 정렬된 배열내용 출력

		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println("정렬 전");
		for (Book book : books) {
			System.out.println(book);
		}

		Arrays.sort(books);

		System.out.println("정렬 후");
		for (Book book : books) {
			System.out.println(book);
		}

//		
//		
//		int[] bps;
////		= { books[0].price, books[1].price, books[2].price };
//		for (int i = 0; i < books.length; i++) {
//			bps={books[i].price};
//		}
//		System.out.println(Arrays.toString(bps));

//		System.out.println(books[0].price);
//
//		for (int i = 0; i < books.length; i++) {
//			int[] bps = { books[i].price };
//			System.out.println(Arrays.toString(bps));
//		}

//		
//		System.out.println(Arrays.toString(bps));
//		Arrays.sort(bps);
//		System.out.println(Arrays.toString(bps));

//
//		Arrays.sort(books);

	}
}

class Book implements Comparable {
	int price;

	public Book(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Book b) {
			return this.price - b.price;
		}
		return -9999999;
	}

	@Override
	public String toString() {
		return String.format("Book [price = %d]", price);
	}

}
