package com.astro.daily;
import java.util.Scanner;

public class Scratchwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(Price?)");
		Scanner valIn = new Scanner(System.in);
		int price = 0;
		while(price != 1221) {
			price = valIn.nextInt();
			if (price == 1221) break;
				if(price > 500) 
					System.out.println("(Price High)");

				
				else 
					System.out.println("(Price Okay)");
				System.out.println("(Price?)");
	}
		valIn.close();
		}

}
