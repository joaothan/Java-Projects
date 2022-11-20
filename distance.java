package p1;

import java.util.*;
import java.lang.*;
import java.io.*;
public class distance
{

public static void distance(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		String names[] = new String[2];
		double latlon[][] = new double[2][2];
		System.out.print("Enter name of first city: ");
		names[0] = sc.nextLine();
		System.out.print("Enter name of second city: ");
		names[1] = sc.nextLine();
		
		System.out.print("Enter latitude and longitude of first city separated by a space (example 28.8 81.2): ");
		latlon[0][0] = sc.nextDouble();
		latlon[0][1] = sc.nextDouble();
		System.out.print("Enter latitude and longitude of second city separated by a space (example 28.8 81.2): ");
		latlon[1][0] = sc.nextDouble();
		latlon[1][1] = sc.nextDouble();
		System.out.println("Distance between "+names[0]+" and "+names[1]+" is "+distance(latlon[0][0],latlon[0][1],latlon[1][0],latlon[1][1])+" miles.");
		System.out.println(distance(28.6, -81.4, 27.9, -82.5) + " Miles\n");
}
	
private static double distance(double lat1, double lon1, double lat2, double lon2) 
{
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		} else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))
					+ Math.cos(Math.toRadians(lat1)) *Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			return (dist);
		}
	
	}

}
