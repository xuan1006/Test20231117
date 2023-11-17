package org.example;

import java.util.Scanner;

public class Threescanf {

    public String Triangle(int i) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("輸入層數且>2:");
            int input = sc.nextInt();
            if(input<=2){
                System.out.print("小於2");
                break;
            }
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input - i - 1; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

        }
    }
}
