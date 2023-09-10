import java.util.Scanner;

public class INDEX {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String name;
    double hours, hours_payrate, fedwithholding_rate, fedstate_tax, grosspay;

    System.out.print("Enter employee name: ");
    name = input.nextLine();
    System.out.print("Enter number of hours worked in a week: ");
    hours = input.nextDouble();
    System.out.print("Enter hourly pay rate: ");
    hours_payrate = input.nextDouble();
    System.out.print("Enter federal tax withholding rate: ");
    fedwithholding_rate = input.nextDouble();
    System.out.print("Enter state tax withholding rate: ");
    fedstate_tax = input.nextDouble();

    System.out.print("\n\n");
    System.out.print("******WORKERS INFORMATION BEFORE DEDUCTIONS******:");
    System.out.print("\n");

    System.out.print("Employee Name: " + name);
    System.out.print("\nHours worked: " + hours);
    System.out.print("\nPay rate: $ " + hours_payrate);
    // Calculating the grosspay
    grosspay = hours * hours_payrate;
    System.out.print("\nGross Pay: $ " + grosspay);

    System.out.print("\n\n");
    System.out.print("******DEDUCTIONS******:");
    System.out.print("\n");
    // Calculating the deductions

    fedwithholding_rate = (fedstate_tax * grosspay) / 0.2;
    System.out.print("\nFederal with Holding (20%): $ " + fedwithholding_rate);

    double statewithholding = (fedstate_tax * grosspay) / 0.09;
    System.out.print("\nState Withholding  (9.0%): $ " + fedwithholding_rate);

    double deduction = fedwithholding_rate + fedwithholding_rate;
    System.out.print("\nTotal Deduction: $ " + deduction);

    double netPay = (grosspay) - deduction;
     System.out.print("\nTotal Netpay: $ " + netPay);

    
  }
}