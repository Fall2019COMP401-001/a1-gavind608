package a1;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df =  new DecimalFormat("#.##");

		// Your code follows here.
		int numItem = scan.nextInt();
		
		String[] items = new String[numItem];
		double[] price = new double[numItem];
		
		// For loop for names and prices
		for (int i=0; i<numItem; i++) {
			items[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int numCust = scan.nextInt();
		String[] customer_first = new String[numCust];
		String[] customer_last = new String[numCust];
		double[] toPay = new double[numCust];
		
		for (int j=0; j<numCust; j++) {
			customer_first[j] = scan.next();
			customer_last[j] = scan.next();
			int itemTotal = scan.nextInt();
			double total = 0.0;
			
			for (int k=0; k<itemTotal; k++) {
				int amount = scan.nextInt();
				String product = scan.next();
				
				for (int l=0; l<items.length; l++) {
					if (product.equals(items[l])) {
						total += (price[l] * amount);
					}
				
				}
			}
			toPay[j] = total;
		}
		
		double highest = toPay[0];
		String highestFirst = customer_first[0];
		String highestLast = customer_last[0];
		for (int idx=0; idx<numCust-1; idx++) {
			if (highest < toPay[idx+1]) {
				highest = toPay[idx+1];
				highestFirst = customer_first[idx+1];
				highestLast = customer_last[idx+1];
			}
		}
		
		double smallest = toPay[0];
		String smallestFirst = customer_first[0];
		String smallestLast = customer_last[0];
		for (int idx=0; idx<numCust-1; idx++) {
			if (smallest > toPay[idx+1]) {
				smallest = toPay[idx+1];
				smallestFirst = customer_first[idx+1];
				smallestLast = customer_last[idx+1];
			}
		}
		
		double average = 0.0;
		for (int idx=0; idx<numCust; idx++) {
			average += toPay[idx];
		}
		average /= numCust;
		System.out.println("Biggest: " + highestFirst + " " + highestLast + " (" + String.format("%.2f",highest) + ")");
		System.out.println("Smallest: " + smallestFirst + " " + smallestLast + " (" + String.format("%.2f",smallest) + ")");
		System.out.println("Average: " + String.format("%.2f",average));
	}
	
}
