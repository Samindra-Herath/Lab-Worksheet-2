package Q02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter Length in Centimeter: ");
        double number = input.nextDouble();

        double totalinches = number / 2.54;
        int feet =(int)totalinches / 12;
        double inches = totalinches % 12;

        System.out.printf(" %.2f cm = %d ft %.2f inches",number,feet,inches);

        input.close();
    }
}
