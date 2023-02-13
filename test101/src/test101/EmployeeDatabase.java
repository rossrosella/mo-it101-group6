package test101;
import java.util.Scanner;

public class EmployeeDatabase {
	static String[][] employees = {
	        {"10001","Crisostomo","Jose", "	Febuary 14,1988"},
	        {"10002","Mata","	Christian","October 21, 1987"},
	        {"10003","San Jose", "Brad", "	March 15, 1996"},
	        {"10004","Salcedo","	Anthony","	September 14, 1993"},
	        {"10005","Romualdez","Alice","	May 14, 1992"},
	        {"10006","Atienza","	Rosie","	September 24, 1948"},
	        {"10007","Farala","	Martha","	January 11, 1942"},
	        {"10008","Martinez","Leila","	July 11, 1970"},
	        {"10009","San Jose","Allison","	June 24, 1986"},
	        {"10010","Rosario","	Cydney","	October 6, 1996"},
	        {"10011","Lopez","	Josie","	January 14, 1937"},
	        {"10012","De Leon","	Selena","	February 20, 1945"},
	        {"10013","Romualdez","Fredrick","March 10, 1985"},
	        {"10014","Bautista","Mark","	February 12, 1961"},
	        {"10015","Lazaro","	Darlene","	November 25, 1985"},
	        {"10016","Delos Santos","Kolby","	February 26, 1980"},
	        {"10017","Santos","	Vella","	December 31, 1983"},
	        {"10018","Del Rosario","Tomas","	December 18, 1978"},
	        {"10019","Tolentino","Jacklyn","	May 19, 1944"},
	        {"10020","Gutierrez","Percival","December 18, 1970"},
	        {"10021","Manalaysay","Garfield ","August 28, 1966"},
	        {"10022","Villegas","Lizeth","	December 12, 1981"},
	        {"10023","Ramos","	Carol","	August 20, 1978"},
	        {"10024","Maceda","	Emelia","	April 14, 1963"},
	        {"10025","Aguilar","	Delia","	January 27, 1939"},
	        
	        
	    };
	public static void display() {
		Scanner input = new Scanner(System.in);
        int choice;
        while(true) {
        System.out.println("Welcome to Employees Database!");
        System.out.println("1. View Employees");
        System.out.println("2. Modify Employee");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                viewEmployees();
                break;
            case 2:
                modifyEmployee();
                break;
            case 3:
                System.out.println("Exiting the Employee Database... Goodbye!");
                return;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
    }
}

public static void viewEmployees() {
    System.out.println("Employee Number\tEmployee LastName\tEmployee Name\t\tBirthday");
    for (String[] employee : employees) {
        System.out.println(employee[0] + "\t\t" + employee[1] + "\t\t" + employee[2]+ "\t\t" + employee[3]);
    }
}

public static void modifyEmployee() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter employee number: ");
    String empNum = input.nextLine();
    for (int i = 0; i < employees.length; i++) {
        if (employees[i][0].equals(empNum)) {
            System.out.print("Enter new Lastname: ");
            String newName = input.nextLine();
            System.out.print("Enter new name: ");
            String newLastName = input.nextLine();
            System.out.print("Enter new birthday: ");
            String newBirthday = input.nextLine();
            employees[i][1] = newName;
            employees[i][2] = newLastName;
            employees[i][3] = newBirthday;
            System.out.println("Employee data updated successfully!");
            return;
        }
    }
    System.out.println("Employee number not found!");
 }
}
	
