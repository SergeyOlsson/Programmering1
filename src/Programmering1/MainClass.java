package Programmering1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SecondClass secondClass = new SecondClass();
        SecondClass counter = new SecondClass();

        String input;

        do {
            System.out.print("Enter a line of text:");
            input = scan.nextLine();
            //kallar på räknarmetoden
            counter.count(input);
            //Kallar på stopmetoden
            secondClass.StopCheck(input);

        } while (! input.equalsIgnoreCase("stop"));

        //skriver ut resultat.
        counter.printResults();
        scan.close();
    }
}