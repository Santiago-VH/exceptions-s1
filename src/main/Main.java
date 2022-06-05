package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import model.Car;
import model.Motorcycle;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Manager manager = new Manager();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		//LocalDateTime now = LocalDateTime.now();
		//System.out.println(dtf.format(now));
		
		System.out.println("Qué vehiculo usa? \n\n 1.Auto \n 2.Motocicleta");
		int number= Integer.parseInt(br.readLine());
		
		System.out.println("Digite la placa de su vehiculo\n\n");
		String plate= br.readLine();
			
		System.out.println("Digite su cédula de ciudadanía\n\n");
		int cedula= Integer.parseInt(br.readLine());
		if(number==1) {
			manager.addCar(plate);
		} else if(number==2){
			manager.addMoto(plate);
		}
	}
}

	