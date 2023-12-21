package org.example;

import java.util.Scanner;

public class ManualInput {

    static int number(){
        boolean correct = false;
        String tmp;
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(!correct){
            try {
                System.out.println("Please enter random integer number ");
                tmp = scan.nextLine();
                num = Integer.parseInt(tmp);
                if (num < 0) throw new NumberFormatException();
                correct = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter positive number ");
            }
        }
        return num;
    }
}
