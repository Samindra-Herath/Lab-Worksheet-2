package Q07;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter ur weight here: ");
        double weight = input.nextDouble();

        System.out.print("Enter ur height here: ");
        double height = input.nextDouble();

        double BMI = weight / Math.pow((height /100),2);

        System.out.printf("Your Calculated BMI is %.3f",BMI);
        input.close();
    }
}
