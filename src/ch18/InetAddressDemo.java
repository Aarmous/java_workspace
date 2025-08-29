package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		InetAddress add1 = null, add2 = null;
		System.out.println("호스트 이름을 입력하세요.");

		String url = in.nextLine();

		try {
			add1 = InetAddress.getByName(url);
			add2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(add1.getHostAddress());
		System.out.println(add2);

	}

}
