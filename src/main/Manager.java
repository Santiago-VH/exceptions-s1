package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Car;
import model.Motorcycle;

public class Manager {

	public Manager() {
	}
	
	ArrayList<Car> cars;
	ArrayList<Motorcycle> motorcycles;
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void addMoto(Motorcycle moto) {
		motorcycles.add(moto);
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public ArrayList<Motorcycle> getMotorcycles() {
		return motorcycles;
	}

	public void setMotorcycles(ArrayList<Motorcycle> motorcycles) {
		this.motorcycles = motorcycles;
	}


	
	
}
