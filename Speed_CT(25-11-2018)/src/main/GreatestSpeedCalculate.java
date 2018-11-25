package main;

import java.util.Scanner;

public class GreatestSpeedCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maxT=60, r=3, m;
		double mass, v, ans=0.0;
		
		System.out.println("Enter the value of mass(m): ");
		m=sc.nextDouble();
		v= maxT/(2*m*r);
		
		int speed[]={1,10,20,40};
		
		for(int i=0; i<4 ; i++)
		{
			if( v>=speed[i] ) ans=speed[i];
		}
		System.out.println("The gretest speed at which it whirled without breaking : " + ans +"ms^-1");
	}

}
