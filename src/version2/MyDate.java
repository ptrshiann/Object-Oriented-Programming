/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

public class MyDate {

    private int day;
    private int month;
    private int year;

    private static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
    };


    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }


    public MyDate(int day, int month, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

  
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

  
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

 
    public void displayDate() {
        System.out.println("Date: " + toString());
    }

  
    @Override
    public String toString() {
        return String.format(
                "%02d %s %04d",
                day,
                MONTHS[month - 1],
                year
        );
    }
}