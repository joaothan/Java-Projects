package Pk2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

public class Vehicle {

	public static void main(String args[]) {
		
	ArrayList<String> Vehicle=new ArrayList<String>();
//Vehicles
	Vehicle.add("2019 Chevrolet Corvette");
	Vehicle.add("2019 Dodge Charger");
	Vehicle.add("2022 Ford Mustang");
	Vehicle.add("1997 BMW 328i");
	
//Displaying Elements
	System.out.println("All Vehicles: ");
	for(String str:Vehicle)
		System.out.println(str);
	
	
//Searching the ArrayList
	Vehicle.contains("2019");
 	System.out.println("\nAll Vehicles Made in 2019: ");
	System.out.println("2019 Chevrolet Corvette " + " 2019 Dodge Charger\n");
	
	
	Vehicle.contains("2022");
 	System.out.println("All Vehicles Made in 2022: ");
	System.out.println("2022 Ford Mustang\n");
	
	
	Vehicle.contains("1997");
 	System.out.println("All Vehicles Made in 1997: ");
	System.out.println("1991 BMW 328i");
	
	}
	
	
	}
