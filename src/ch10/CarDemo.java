package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3); // 인덱스 0부터 시작해서, 3개를 list에 담아라.
		System.out.println(list.size()); // list에 3개 담겨있다고, 3이 출력
		Car[] cars = list.toArray(new Car[3]);

		System.out.println();
		Comparator<Car> modelComparator = Comparator.comparing(c -> c.getModel());
		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		System.out.println();
//		Comparator<Car> mileageComparator = Comparator.comparing(c -> c.getMileage());
		Comparator<Car> mileageComparator = Comparator.comparing(Car::getMileage);
		// 위에 두 줄이 같다. (뒷쪽에 :: 부분)
		Arrays.sort(cars, mileageComparator); // 오름차순으로 정렬
		System.out.println(Arrays.toString(cars));

		System.out.println();
		Comparator<Car> ageComparator = Comparator.comparing(c -> c.getAge());
		Arrays.sort(cars, ageComparator.reversed()); // 내림차순으로 정렬
		System.out.println(Arrays.toString(cars));

	}

}
