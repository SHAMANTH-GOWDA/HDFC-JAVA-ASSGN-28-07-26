package com.masai;

import java.util.Scanner;

public class assg10e {
    public int fib(int n){

        if(n==1)return 0;
        if(n==2)return 1;

        return fib(n-1)+fib(n-2);
    }
    static void main(String[] args) {

        assg10e c = new assg10e();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        for(int i=1 ; i <=number ;i++){
            int e = c.fib(i);
            System.out.print(e+" ");
        }



    }
}
