package Q04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in lbs: ");
        double weight = input.nextDouble();

        double calories = weight * 19;

        System.out.printf("Total calories you need - %.3f" , calories);

        input.close();


    }

}
