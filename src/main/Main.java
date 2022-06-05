package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import exceptions.WrongLettersForTimeCarException;
import exceptions.WrongLettersForTimeMotoException;
import exceptions.WrongNumbersForTimeCarException;

import model.Car;
import model.Motorcycle;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException, WrongLettersForTimeCarException, 
													WrongLettersForTimeMotoException,WrongNumbersForTimeCarException{
		Manager manager = new Manager();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Qué vehiculo usa? \n\n 1.Automovil \n 2.Motocicleta");
		int number= Integer.parseInt(br.readLine());
		int index=number-1;
		
		System.out.println("Digite la placa de su vehiculo, separe las letras y numeros con guiones(ejemplo: ABC-12-D)\n\n");
		String plate= br.readLine();
		
		if(number==1) {
			index++;
			Car car=new Car(plate);	
			manager.addCar(car);
			String[] parts = plate.split("-");
			String plateLetters = parts[0]; 
			
			
			try {
				
				throw new WrongLettersForTimeCarException(plate);
			}catch(WrongLettersForTimeCarException wlftce){
				System.out.println("El auto tiene letras no permitidas a esta hora de ingreso, vuelva mas tarde");
				System.err.println(wlftce.getMessage());
			}
			
		} else if(number==2) {
			Motorcycle moto=new Motorcycle(plate);
			manager.addMoto(moto);
			
			try {
				manager.getMotorcycles().get(index).getMotoPlate();
				throw new WrongLettersForTimeMotoException();
			} catch(WrongLettersForTimeMotoException wlftme) {
				System.out.println("La motocicleta tiene letras no permitidas a esta hora de ingreso, vuelva mas tarde");
				System.err.println(wlftme.getMessage());
			}
		} 	

		System.out.println("Digite su cédula de ciudadanía\n\n");
		int cedula= Integer.parseInt(br.readLine());
		
	
	
	}
}

	