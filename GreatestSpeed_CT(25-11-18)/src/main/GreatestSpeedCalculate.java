package main;

import java.util.Scanner;

public class GreatestSpeedCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maxT=60.0, r=3.0, m;
		double mass, v, ans=0.0;
		
		System.out.println("Enter the value of mass(m): ");
		m=sc.nextDouble();
		
		ans=SpeedCalculate(m);
		
		System.out.println("The gretest speed at which it whirled without breaking : " + ans +"ms^-1");
	}
	public static double SpeedCalculate(double m)
	{
		double maxT=60.0, r=3.0;
		double mass, ans=0.0;
		double v= Math.sqrt( (maxT*r)/m );
		
		double speed[]={1.0,10.0,20.0,40.0};
		
		for(int i=0; i<4 ; i++)
		{
			if( v>=speed[i] ) ans=speed[i];
		}
		return ans;
	}
	
}
