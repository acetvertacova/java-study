package com.calculator;
import java.util.Scanner;

public class calculator {

    public static void Menu() {
        System.out.println("Choose operation:");
        System.out.println("For + pick 1 ");
        System.out.println("For - pick 2 ");
        System.out.println("For * pick 3 ");
        System.out.println("For / pick 4 ");
        System.out.println("For menu pick 5 ");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to calculator " );


        Menu();

        System.out.println("Enter the operation: " );
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        Scanner number = new Scanner(System.in);
        switch(operation) {
            case "1":
                System.out.println("Enter the first number for sum: " );
                double numSum1 = number.nextDouble();
                System.out.println("Enter the second number for sum : " );
                double numSum2 = number.nextDouble();
                System.out.println("The sum: " );
                System.out.println(numSum1+numSum2);
                break;

            case "2" :
                System.out.println("Enter the first number for difference: " );
                double numDiff1 = number.nextDouble();
                System.out.println("Enter the second number for difference : " );
                double numDiff2 = number.nextDouble();
                System.out.println("The difference: " );
                System.out.println(numDiff1-numDiff2);
                break;

            case "3":
                System.out.println("Enter the first number for multiplication: " );
                double numMulti1 = number.nextDouble();
                System.out.println("Enter the second number for multiplication : " );
                double numMulti2 = number.nextDouble();
                System.out.println("The multiple: " );
                System.out.println(numMulti1*numMulti2);
                break;
            case "4" :
                System.out.println("Enter the first number for division: " );
                double numDiv1 = number.nextDouble();
                System.out.println("Enter the second number for division : " );
                double numDiv2 = number.nextDouble();
                System.out.println("The division: " );
                System.out.println(numDiv1/numDiv2);
                break;
            case "5" :
                Menu();
                break;
        }



    }
}