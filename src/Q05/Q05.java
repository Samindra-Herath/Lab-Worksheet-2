package Q05;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temp in fahrenheit: ");
        double temp_in_fahrenheit = input.nextDouble();

        double celsius  = (5.0/9.0) * (temp_in_fahrenheit - 32);

        System.out.printf("%.2f °F = %.2f °C",temp_in_fahrenheit,celsius);
        input.close();
    }
}
