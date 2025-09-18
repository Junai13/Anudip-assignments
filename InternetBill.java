package lab3;

import java.util.Scanner;

public class InternetBill {

    public static void main(String[] args) {
        // Create object of InternetBill and call getInput() method
        InternetBill bill = new InternetBill();
        bill.getInput();
    }

    // Method to take input from user
    private void getInput() {
        
        Scanner in = new Scanner(System.in);
        
        // Ask user to enter data consumed
        System.out.println("Enter the amount of data consumed : (in GB)");
        int data = in.nextInt();   // Read input from user
        
        // Call process method to calculate bill
        process(data);
        
        // Close the scanner to avoid resource leak
        in.close();
    }

    // Method to calculate bill amount based on given conditions
    private void process(int data) {
        
        double billAmount;  // variable to store final bill
        
        // Case 1: If usage is less than 10 GB
        if(data < 10) {
            billAmount = 300;   // Basic charge
        } 
        // Case 2: If usage is between 10 and 30 GB
        else if(data <= 30) {
            billAmount = 300 + 5 * (data - 10);  // Rs 5 for each GB above 10
        } 
        // Case 3: If usage is more than 30 GB
        else {
            billAmount = 400 + 3 * (data - 30);  // Rs 3 for each GB above 30
        }
        
        // Print the final bill amount
        System.out.println("Data Consumed = " + data + " GB");
        System.out.println("Total Bill Amount = Rs. " + billAmount);
    }
}
