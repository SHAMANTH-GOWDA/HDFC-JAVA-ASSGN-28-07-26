package com.masai;

import java.util.Scanner;

import static java.lang.Math.abs;

public class assg10c {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        int count =0;

        while(abs(number) > 0){
            count++;

            number = number/10;
        }

        System.out.println(count);
    }
}
