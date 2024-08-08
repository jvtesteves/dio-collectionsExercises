package com.jvtesteves.exercise01;


import java.util.ArrayList;
import java.util.List;

/*
Create a program that receives the average temperature of the first 6 months of the year and stores them in a list.
After that, calculate the average temperature for the semester and show all the temperatures above this average,
and in which month they occurred (show the month in full: 1 – January, 2 – February, etc.).
*/

public class AverageTemperature {

    public static void main(String[] args) {

        // Initialize the list of temperatures
        List<Double> temperatures = new ArrayList<>();
        temperatures.add(12.0);
        temperatures.add(13.3);
        temperatures.add(11.5);
        temperatures.add(13.1);
        temperatures.add(12.2);
        temperatures.add(14.8);

        // Initialize the list of months
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");

        // Calculate the sum of temperatures
        double sum = 0;
        for (Double temp : temperatures) {
            sum += temp;
        }

        // Calculate the average temperature for the semester
        double average = sum / temperatures.size();

        // Display the average temperature of each month
        for (int i = 0; i < temperatures.size(); i++) {
            System.out.println("Average temperature of " + months.get(i) + " = " + temperatures.get(i) + " Celsius degrees");
        }

        // Display the months with temperatures above the average
        System.out.println("\nMonths with temperatures above average:");
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > average) {
                System.out.println(months.get(i) + " was above average temperature");
            }
        }
    }
}
