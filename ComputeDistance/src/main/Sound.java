package main;

import java.util.Scanner;

public class Sound {

	public static void main(String[] args) {
		
		System.out.println("For velocity=1100fts^-1 and time=7.2s, ");
		//Scanner in=new Scanner(System.in);
		double velocity, time, ans;
		velocity=1100.0;
		time=7.2;
		
		ans=distanceCalculate(velocity, time);
		System.out.println("Distance: "+ans);
	}
	
	public static double distanceCalculate(double velocity, double time)
	{
		double distance;
		distance = (velocity * time);
		return distance;
	}

}
