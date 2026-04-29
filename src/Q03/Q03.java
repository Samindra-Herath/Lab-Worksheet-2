package Q03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter temp in celsius - ");
        double temp_in_celsius = input.nextDouble();

        double Fahrenheit  = (temp_in_celsius * 1.8) + 32;

        System.out.printf("%.2f °C = %.2f °F",temp_in_celsius,Fahrenheit);
        input.close();

    }
}
