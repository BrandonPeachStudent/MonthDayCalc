package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int dayOfWeek;
	int dayOfMonth;
	int month;
	int year;
	int yearOfCentury;
	int yearZeroBased;
	Scanner Keyboard;
	Scanner keyboard = new Scanner(System.in);
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go,");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,\n" +
                "is fair and wise and good in every way.");

        System.out.println("What month were you born? (Enter the number)");
        month = keyboard.nextInt();
        System.out.println("What day were tou born? (Enter the number)");
        dayOfMonth = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();
        
    }


}
