package test101;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
    	Scanner sc = new Scanner(System.in);
    	int choice = 0;
        while (choice !=4) {
            System.out.println("Welcome to the MotoPh Main Menu!");
            System.out.println("1. Employee Database ");
            System.out.println("2. Payroll System");
            System.out.println("3. Inventory System");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                	EmployeeDatabase.display();
                	                             
                    break;
                case 2:
                	PayrollSystem.display();
                	PayrollSystem.main(null);
                    break;
                case 3:
                    InventorySystem.display();
                    break;
                case 4:
                    System.out.println("Exiting the program... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}


