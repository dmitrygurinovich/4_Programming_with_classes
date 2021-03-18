package by.epam.classes.main;

import by.epam.classes.entity.Car;
import by.epam.classes.entity.Engine;
import by.epam.classes.entity.Wheel;
import by.epam.classes.logic.CarLogic;

/*
 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
	public static void main(String[] args) {
		Car car = new Car("Mazda", "323F BA", 55, 220, new Engine(5, 1.8, 125, "petrol", 7.0),
				new Wheel(16, 195, 65));
		
		CarLogic logic = new CarLogic();
		
		logic.changeWgeel(car, new Wheel(15, 185, 60));
		
		System.out.println(logic.printModel(car));
		
		System.out.println(car);
		
		System.out.println(logic.drive(car, 80, 30));  
		
		logic.refuel(car, 30); 
		
		System.out.println(car);
		
		System.out.println(logic.drive(car, 80, 30)); 
		
		System.out.println(car);
	}
}
