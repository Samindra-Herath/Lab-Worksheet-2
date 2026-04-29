package Q06;

import java.time.LocalDate;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birth_year = input.nextInt();

        int  l_date = java.time.Year.now().getValue();

        int age = l_date - birth_year;

        System.out.printf("Your age is %d",age);

        input.close();

    }
}
