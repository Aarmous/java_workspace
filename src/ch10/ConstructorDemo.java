package ch10;

public class ConstructorDemo {

	public static void main(String[] args) {
//		NewObject<String> s = x

	}

}

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}
