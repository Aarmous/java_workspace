package ch18;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 5000);
			OutputStream os = client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject("당당당당");
			oos.flush();
			Thread.sleep(1000); // 안되다가 이걸하니까 되네
//			oos.close();  // 위에 쓰레드로 해결한 문제에 대해 
//			client.close();  // gpt가 해결한 방식이 이 2줄 코드. 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
