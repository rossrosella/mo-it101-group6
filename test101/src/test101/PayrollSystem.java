package test101;

/*public class PayrollSystem {
	 public static void display() {
	        System.out.println("Welcome to the Payroll System!");
	        // Additional code here
	        String employeeName = "Jam Popot";
	        int hoursWorked = 40;
	        double payRate = 15.00;
	        double taxRate = 0.10;
	        int paidLeaves = 2;
	        // Calculate gross pay
	        double grossPay = hoursWorked * payRate;
	        // Deduct pay for paid leaves
	        grossPay -= (payRate * 8) * paidLeaves;
	        // Calculate taxes
	        double taxes = grossPay * taxRate;
	        // Calculate net pay
	        double netPay = grossPay - taxes;
	        // Print payroll information
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Hours Worked: " + hoursWorked);
	        System.out.println("Pay Rate: $" + payRate);
	        System.out.println("Paid Leaves: " + paidLeaves);
	        System.out.println("Gross Pay: $" + grossPay);
	        System.out.println("Taxes: $" + taxes);
	        System.out.println("Net Pay: $" + netPay);
	        
	    }
} **/
//import java.util.HashMap;
import java.util.Scanner;
public class PayrollSystem {
	public static void display() 
	{System.out.println("Welcome to the Payroll System!");
    
}
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
             
        
        System.out.print("Enter the employee number: ");
        int employeeNumber = sc.nextInt();

        double hourlyRate;
        switch (employeeNumber) {
            case 10001:
                hourlyRate = 373.04;
                break;
            case 10002:
                hourlyRate = 255.80;
                break;
            case 10003:
                hourlyRate = 255.80;
                break;
            case 10004:
                hourlyRate = 362.05;
                break;
            case 10005:
                hourlyRate = 133.93;
                break;
            case 10006:
                hourlyRate = 133.93;
                break;
            case 10007:
                hourlyRate = 142.86;
                break;
            case 10008:
                hourlyRate = 142.86;
                break;
            case 10009:
                hourlyRate = 133.93;
                break;
            case 10010:
                hourlyRate = 133.93;
                break;
            case 10011:
                hourlyRate = 229.02;
                break;
            case 10012:
                hourlyRate = 249.11;
                break;
            case 10013:
                hourlyRate = 377.98;
                break;
            case 10014:
                hourlyRate = 138.39;
                break;
            case 10015:
                hourlyRate = 138.39;
                break;
            case 10016:
                hourlyRate = 142.86;
                break;
            case 10017:
                hourlyRate = 133.93;
                break;
            case 10018:
                hourlyRate = 133.93;
                break;
            case 10019:
                hourlyRate = 142.86;
                break;
            case 10020:
                hourlyRate = 147.32;
                break;
            case 10021:
                hourlyRate = 147.32;
                break;
            case 10022:
                hourlyRate = 142.86;
                break;
            case 10023:
                hourlyRate = 133.93;
                break;
            case 10024:
                hourlyRate = 133.93;
                break;
            case 10025:
                hourlyRate = 133.93;
                break;
           
            default:
                System.out.println("Employee not found!");
                return;
        }

        System.out.print("Enter the number of hours worked this week : ");
        double hoursWorked = sc.nextDouble();

        double grossWeeklySalary = hourlyRate * hoursWorked;
        double BIRtax = grossWeeklySalary * 0.20;
        double sssContribution = grossWeeklySalary *.045;
        double pagIbigContribution = 100.0;
        double philHealthContribution =275.0 ;
        double totalDeductions = sssContribution + pagIbigContribution + philHealthContribution;
        double netWeeklySalary = grossWeeklySalary - totalDeductions;
        double netwithtax = netWeeklySalary - BIRtax ;
        
        if (netWeeklySalary < 20832) {
            BIRtax = 0.0; // No piste 
        }  
        /*if (netWeeklySalary < 3250) {
            sssContribution = 135; // No piste 
           
        }
        if (netWeeklySalary < 3250) {
            sssContribution = 135; // No piste 
           
        }**/
     
     
        System.out.println("Gross Weekly Salary: " + grossWeeklySalary);
        System.out.println("SSS Contribution " + sssContribution);
        System.out.println("PagIbig " + pagIbigContribution);
        System.out.println("PhIlHealth " + philHealthContribution); 
        System.out.println("Weekly Salary w/ deductions : " + netWeeklySalary);
        System.out.println("BIR Tax " + BIRtax);
        System.out.println("Net Weekly Salary with tax: " + netwithtax);
    
	
	
	
	
	}
	
}
