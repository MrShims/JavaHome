package com.Task2;

public class Task2 {
        public static void main(String[] args) {
            int year = 2021;
            int dayNum=15;
            int [] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
            String[] Months ={"January","February","March","April","May","June","July","August","September", "October", "November","December"};
            int monthNum=0;
            boolean isLeapYear= (year%4==0)&& (year%100!=0 || year%400==0);
            for(int days : daysInMonths)
            {
                if (isLeapYear&days==28)
                {
                    days++;
                }
                if (dayNum<=days)
                {
                    break;
                }
                dayNum=dayNum-days;
                monthNum++;
            }
            System.out.println(dayNum+ " " + Months[monthNum]);

        }

}
