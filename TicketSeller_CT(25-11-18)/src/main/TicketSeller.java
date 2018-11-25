package main;

import java.util.Scanner;

public class TicketSeller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=10, n;
		while(N>0) {
			System.out.print("Number of tickets want to buy: ");
			n=sc.nextInt();
			if(n>4) {
				System.out.println("Sorry, you can buy atmost 4 tickets.");
				n=4;
			}
			N-=n;
			System.out.println("Number of remaining tickets : "+ N);
		}
		System.out.println("Sorry, Here no more ticket available.");
	}

}
