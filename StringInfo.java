package string;
public class StringInfo {
	public static void main(String[] args) {
		String cars = " Maruti, Hyundai, Audi, BMW, Jeep, Tata, Mahindra, Kia, Toyota";
		String allCar[] = cars.split(",");
		for(String car: allCar) {
			System.out.println(car);
		}
	}

}
