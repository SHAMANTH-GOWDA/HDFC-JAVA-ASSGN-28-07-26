package com.masai;

kkk

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Demo {

    public  static  void main(String[] args){

        String storedusername = "hdfc";
        String storedpassword = "hdfc@1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter user");

        String username = sc.next();

        System.out.println("enter password");
        String pass = sc.next();

        if(username.equals(storedusername) && pass.equals(storedpassword)){
            System.out.println("correct password and username");
        }else{
            System.out.println("invalid credentials ");
        }
    }

}
