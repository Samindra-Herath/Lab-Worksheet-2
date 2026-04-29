package Q08;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter radius here: ");
        double r = input.nextDouble();

        double v = (4.0/3.0) * (Math.PI * Math.pow(r,3));

        System.out.printf("Sphere Volume - %.3f ",v);

        input.close();


    }
}
