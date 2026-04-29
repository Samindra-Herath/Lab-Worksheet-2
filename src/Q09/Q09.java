package Q09;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount($): ");
        double p = input.nextDouble();

        System.out.print("Annual interest rate (in percent): ");
        double r = input.nextDouble();

        System.out.print("Number of years: ");
        int n = input.nextInt();

        double Amount = p * Math.pow( (1 +(r/100)) , n);


        System.out.printf("Your earned $%.2f after %d years", Amount,n);

    }
}
