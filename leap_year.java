//package com.company;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year.");
        Scanner year = new Scanner(System.in);
        int leap;
        leap=year.nextInt();
        if (leap%4==0 && leap%100!=0 || leap%1000==0) {
            System.out.println("This year is leap year.");
        }
        else{
            System.out.println("This year is not a leap year.");
        }
        }
}
