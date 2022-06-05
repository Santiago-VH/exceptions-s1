package main;

import java.util.ArrayList;

import model.Car;
import model.Motorcycle;

public class Manager {

	public Manager() {
	}
	
	ArrayList<Car> cars;
	ArrayList<Motorcycle> motorcycles;
	
	public void addCar(String plate) {
		Car car=new Car(plate);	
		cars.add(car);
	}
	
	public void addMoto(String plate) {
		Motorcycle moto=new Motorcycle(plate);
		motorcycles.add(moto);
	}


	
	
}
