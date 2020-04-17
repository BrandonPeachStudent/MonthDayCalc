package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        System.out.println("");

        System.out.println("Lets figure out what day you were born");
        System.out.println("What month were you born? (Enter the number)");
        month = keyboard.nextInt();
        System.out.println("What day were you born? (Enter the number)");
        dayOfMonth = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();

        int monthAnswer = amountOfDaysInMonth(month, year);
        System.out.println("There are " + monthAnswer + " days in this month");

        int zellerCongruenceAnswer = ZellerCongruence(month, year, dayOfMonth);

        String poemLinesAnswer = PoemLines(zellerCongruenceAnswer);
        System.out.println(poemLinesAnswer);

        System.out.println("Thank you for trying the month day calculator. Do you want to enter another date? (Yes or No)");
        Scanner key = new Scanner(System.in);
        String answer2 = keyboard.next().toLowerCase();
        if(answer2.equals("yes")) {
            main(args);
        }else  {
            System.out.println("Thanks for trying the Month Day Calculator!");
        }


    }
        public static int amountOfDaysInMonth (int month, int year){
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 9:
                case 10:
                case 12:
                    return 31;

                case 4:
                case 6:
                case 7:
                case 11:
                    return 30;

                default:
                    if (year % 4 == 0) {
                        return 29;
                    } else {
                        return 28;
                    }

            }

        }

        public static int ZellerCongruence ( int month, int year, int dayOfMonth){
            if (month == 1 || month == 2) {
                month = (month + 12);
                year--;
            }

            int yearZero = (year / 100);
            int zellerCongruenceEquation = 13 * (month + 1);
            int yearCentury = (year % 100);
            int dayOfWeek = ((dayOfMonth + (zellerCongruenceEquation / 5) + yearCentury + (yearCentury / 4) + (yearZero / 4) + (5 * (yearZero))) % 7);
            return dayOfWeek;
        }

        public static String PoemLines ( int dayOfWeek){
            switch (dayOfWeek) {
                case 2:
                    return ("You were born on a Monday. Based on the poem you are fair of face.");
                case 3:
                    return ("You were born on a Tuesday. According to the poem, you are full of grace.");
                case 4:
                    return ("You were born on a Wednesday. Therefore you are full of woe.");
                case 5:
                    return ("You were born on a Thursday. Based on the poem, you have far to go.");
                case 6:
                    return ("You were born on a Friday. The poem says you are loving and giving.");
                case 0:
                    return ("You were born on a Saturday. According to the poem, you work hard for a living.");
                default:
                    return ("You were born on the Sabbath Day. Therefore you are fair and wise in every way");

            }
        }
    }



