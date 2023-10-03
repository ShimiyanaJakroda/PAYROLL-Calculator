import java.util.Scanner; // Scanner Library which allows us to scan

public class INDEX {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Scanner propert

    System.out.print("Enter employee's name: ");
    String name = input.nextLine();

    System.out.print("Enter number of hours worked in a week: ");
    double hours_Worked = input.nextDouble();

    System.out.print("Enter hourly pay rate: ");
    double hourlyPayRate = input.nextDouble();

    System.out.print("Enter federal tax withholding rate (20%): ");
    double federalTaxRate = input.nextDouble() / 100;

    System.out.print("Enter government tax withholding rate (9%): ");
    double goverTaxRate = input.nextDouble() / 100;
    // Formulars used in the program
    double grossPay = hours_Worked * hourlyPayRate;
    double fed_Withholding = grossPay * federalTaxRate;
    double gov_Withholding = grossPay * goverTaxRate;
    double netPay = grossPay - (fed_Withholding + gov_Withholding);

    // The if statement below states that we should only use positive inputs
    // throughout
    // the entry points if any negative is entered it wont give the out put
    if (hours_Worked > 0 && hourlyPayRate > 0 && federalTaxRate > 0 && goverTaxRate > 0) {
      System.out.println("\n********* PERSONAL INPUTS************");

      System.out.println("Payroll Statement for " + name);
      System.out.println("Hours worked: " + hours_Worked);
      System.out.println("Hourly pay rate: $ " + hourlyPayRate);

      System.out.println("\n********* GROSSPAY************");
      System.out.println("Gross pay: $ " + grossPay);

      System.out.println("\n********* TAX DEDUCTION************");
      System.out.println("Deductions:");
      System.out.println("  Federal Tax Withholding: $ " + fed_Withholding);
      System.out.println(" Government Tax Withholding: $ " + gov_Withholding);

      System.out.println("\n********* NETPAY FOR THE WORKER************shimi");
      System.out.println("Net pay: $ " + netPay);
    }

    else {
      System.out.println("\nAll the Values you enter should be positive values \n");// When the worker enters negative
                                                                                    // numbers

    }

  }
}