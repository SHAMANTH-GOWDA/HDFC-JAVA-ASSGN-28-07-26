package com.masai;

import java.util.Scanner;

public class assg2 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();


         switch(number /10){
             case 1,2,3,4,5 :
                 System.out.println("Fail");
                 break;

             case 6,7 :
                 System.out.println("C");
                 break;

             case 8:
                 System.out.println("B");
                 break;

             case 9,10:
                 System.out.println("A");
                 break;




         }


    }
}
