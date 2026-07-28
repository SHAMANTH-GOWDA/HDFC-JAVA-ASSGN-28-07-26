package com.masai;

public class Assg4 {

    static void main(String[] args) {

        String plan = "Tuesday";

        switch (plan){

            case "Monday" :
            System.out.println("JAVA");
            break;

            case "Tuesday" :
            System.out.println("Python");
            break;

            case "Wednesday":
                System.out.println("DBMS");
                break;

            case "Thursday" :
                System.out.println("OS");
                break;

            case "Friday" :
                System.out.println();
                break;

            case "Weekend" :
                System.out.println("sleep");
                break;

            default:
                System.out.println("Enter a valid day");
                break;
        }

    }
}
