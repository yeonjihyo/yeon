package Day9;

public class ClassEx4 {

	public static void main(String[] args) {
		Car car=new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		car.setGear('D');
		for (int i=1;i<=50;i++){
			car.acccar();
		car.printCar();
		car.turnOff();
		car.printCar();
		}

	}

}
