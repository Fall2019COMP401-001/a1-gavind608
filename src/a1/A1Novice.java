package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numCust = scan.nextInt();
		
		String[] first = new String[numCust];
		String[]last = new String[numCust];
		double[] total = new double[numCust];
		
		for (int i=0; i<numCust; i++) {
			first[i] = scan.next();
			// First Name
			
			last[i] = scan.next();
			// Last Name
			
			int numItems = scan.nextInt();
			// Number of Items
			
			total[i] = 0.0;
			
			for (int j=0; j<numItems; j++) {
				int quantity = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				total[i] += (quantity * price);
			}
			
		}
		for (int idx=0; idx<numCust; idx++) {
			System.out.println(first[idx].charAt(0) + ". " + last[idx] + ": " + String.format("%.2f",total[idx]));
		}
		
	}
}
