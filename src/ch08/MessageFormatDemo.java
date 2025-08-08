package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String java = "JAVA";
		int version = 8;

		System.out.println(String.format("%s, %d", java, version));

		String mf = MessageFormat.format("{0}, {1} : {0} {0} {0}", java, version);
		System.out.println(mf);

	}

}
