import java.util.*;
/*
* Author: Christopher Allen
* Date: 10-2-2025
* Purpose: Second day out of the thirty days of coding
* Shows off User input, While Loop, and User Interface
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        boolean loop;
        String hist;

        System.out.println("[Welcome to the Calculator]");

        loop = true;
        while(loop){
            double firstNum;
            double secondNum;
            int option;

            System.out.print("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.History\n6.Quit\nEnter Option: ");
            option = scan.nextInt();

            if(option == 1){
                System.out.print("\nEnter the first number: ");
                firstNum = scan.nextDouble();

                System.out.print("Enter the second number: ");
                secondNum = scan.nextDouble();

                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum) + "\n");

                hist = firstNum + " + " + secondNum + " = " + (firstNum + secondNum);
                history.add(hist);

            }
            else if(option == 2){
                System.out.print("\nEnter the first number: ");
                firstNum = scan.nextDouble();

                System.out.print("Enter the second number: ");
                secondNum = scan.nextDouble();

                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum) + "\n");

                hist = firstNum + " - " + secondNum + " = " + (firstNum - secondNum);
                history.add(hist);
            }
            else if(option == 3){
                System.out.print("\nEnter the first number: ");
                firstNum = scan.nextDouble();

                System.out.print("Enter the second number: ");
                secondNum = scan.nextDouble();

                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum) + "\n");

                hist = firstNum + " * " + secondNum + " = " + (firstNum * secondNum);
                history.add(hist);
            }
            else if(option == 4){
                System.out.print("\nEnter the first number: ");
                firstNum = scan.nextDouble();

                System.out.print("Enter the second number: ");
                secondNum = scan.nextDouble();
                if(secondNum == 0){
                    System.out.println("Cannot divide by zero. Second Number will be 1.0");
                    secondNum = 1;
                }

                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum) + "\n");

                hist = firstNum + " / " + secondNum + " = " + (firstNum / secondNum);
                history.add(hist);
            }
            else if(option == 5){
                System.out.println("\nListing history...");

                for(int i = 0; i < history.size(); i++){
                    System.out.println((i + 1) + ". " + history.get(i));
                }
                System.out.println("Done listing.");
            }
            else if(option == 6){
                System.out.println("Shutting off...");
                loop = false;
            }
            else{
                System.out.println("\nNot an option");
            }


        }
    }
}
