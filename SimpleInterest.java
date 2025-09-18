package lab3;

import java.util.Scanner;

public class SimpleInterest {
	
    // Method to take input from user
	void getInput() {
		Scanner sc = new Scanner(System.in);

        // Input principal and time
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
       
        // Close scanner to free resources
        sc.close();
        
        // Call process() to calculate interest
        process(principal, time);
	}
	
    // Method to calculate Simple Interest
	void process(double principal, double time) {
		
		double rate; // Interest rate
		
        // Decide interest rate based on conditions
        if (principal > 10000) {
            rate = 10; // 10% if more than 10000
        } else if (principal >= 5000 && principal <= 10000) {
            rate = 8;  // 8% if between 5000 and 10000
        } else {
            rate = 5;  // 5% if below 5000
        }

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display results
        System.out.println("\nPrincipal: " + principal);
        System.out.println("Time (years): " + time);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Simple Interest: " + simpleInterest);

	}
    
    // Main method (program execution starts here)
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.getInput(); // Start by taking inputs
    }
}
