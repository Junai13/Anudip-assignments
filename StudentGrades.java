package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
	
    // Method to get student marks as input
    void getInput() {
        Scanner in = new Scanner(System.in); // Scanner object for input
        int arr[] = new int[5]; // Array to store marks of 5 subjects
        
        System.out.println("Enter the marks of the student (out of 100): ");
        for(int i=0; i<5; i++) {
            System.out.print("Subject " + (i+1) + " Mark: ");
            arr[i] = in.nextInt(); // Take input for each subject
        }
        
        // Print the array of marks for reference
        System.out.println(Arrays.toString(arr));
        
        // Call process() method to calculate total, average, and grade
        process(arr);
        
        // Close the scanner to free resources
        in.close();
    }
	
    // Method to calculate total, average, and grade
    private void process(int[] arr) {
        int total = 0; // To store sum of marks
        
        // Calculate total marks
        for(int i=0; i<5; i++) {
            total += arr[i];
        }

        // Calculate average (use double for decimal precision)
        double average = total / 5.0;   
        
        // Print total and average
        System.out.println("\nYour Total Marks = " + total + " / 500");
        System.out.println("Average Marks = " + average);
        
        // Decide grade based on average marks
        if(average > 90)
            System.out.println("Your Grade is Ex");
        else if(average > 80)
            System.out.println("Your Grade is A");
        else if(average > 60)
            System.out.println("Your Grade is B");
        else if(average >= 40)
            System.out.println("Your Grade is C");
        else 
            System.out.println("Your Grade is F");
    }

    // Main method (program execution starts here)
    public static void main(String args[]) {
        StudentGrades st = new StudentGrades();
        st.getInput(); // Call method to start input-taking process
    }
}
