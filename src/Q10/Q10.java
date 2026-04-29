package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount($): ");
        double loan_a  = input.nextDouble();

        System.out.print("Annuel interest rate(%): ");
        double a_interest_rate = input.nextDouble();

        System.out.print("Loan period(In Years): ");
        int loan_p = input.nextInt();

        double monthly_interest_rate = a_interest_rate / 100.0 / 12;

        int number_of_payments = loan_p * 12;

        double monthly_payment = (loan_a * monthly_interest_rate) / (1- Math.pow(1 / (1 + monthly_interest_rate),number_of_payments));
        double total_payment = monthly_payment * number_of_payments;

        System.out.printf("Monthly payment is $%.2f and Total payment is $%.2f",monthly_payment,total_payment);

    }
}
