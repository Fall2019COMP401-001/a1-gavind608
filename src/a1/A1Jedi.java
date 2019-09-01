package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemAmount = scan.nextInt();
		String[] itemName = new String[itemAmount];
		double[] itemPrice = new double[itemAmount];
		int[] itemAmountTotal = new int[itemAmount];
		int[] custPurchaseTotal = new int[itemAmount];
		
		
		
		for (int idx=0; idx<itemAmount; idx++) {
			itemName[idx] = scan.next();
			itemPrice[idx] = scan.nextDouble();
		}
		
		int customerNumber = scan.nextInt();
		
		
		for (int idx=0; idx<customerNumber; idx++) {
			scan.next();
			scan.next();
			int custItemNum = scan.nextInt();
			
			for (int i=0; i<custItemNum; i++) {
				int amount = scan.nextInt();
				String item = scan.next();
				
				for (int j=0; j<itemAmount; j++) {
					if (item.contentEquals(itemName[j])) {
						itemAmountTotal[j] += amount;
						custPurchaseTotal[j]++;
						
					}
				}
			}
		}
		for (int idx=0; idx<itemAmount; idx++) {
			if (custPurchaseTotal[idx] == 0) {
				System.out.println("No customers bought " + itemName[idx]);
			} else {
				System.out.println(custPurchaseTotal[idx] + " customers bought " + itemAmountTotal[idx] + " " + itemName[idx]);
			}
		}
	}
}
