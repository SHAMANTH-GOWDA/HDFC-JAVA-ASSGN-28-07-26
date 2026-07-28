package com.masai;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class assg10d {

    public String reverse(String s1)
    {
        String res="";
        for(int i=s1.length()-1;i>=0;i--)

        {
            res=res+s1.charAt(i);

        }
        return res;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String nums=Integer.toString(num);
        assg10d p1=new assg10d();

        String rev=p1.reverse(nums);
        if(nums.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }


}
