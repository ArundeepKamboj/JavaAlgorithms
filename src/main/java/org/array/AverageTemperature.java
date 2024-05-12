package org.array;
import java.util.*;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days of temprature?");

        int inputDays = console.nextInt();
        double[] temps = new double[inputDays];
        double totalTemp = 0;
        double day_temp, average;
        int days_above_average;
        for(int day=1; day<=inputDays; day++) {
            System.out.println("Enter temperature for day :"+day);
            day_temp = console.nextDouble();
            temps[day-1] = day_temp;
            totalTemp += day_temp;
        }
        System.out.println("Total temperature is : "+totalTemp);
        average = totalTemp/inputDays;
        System.out.println("Average temperature is : "+average);

        days_above_average = number_of_days_above_average(temps,average);

        System.out.println("Number of days temperature above average is : "+days_above_average);
    }

    static int number_of_days_above_average(double[] temps, double average) {
        int number_of_days_above_average = 0;
        for(int day=0; day< temps.length; day++) {
            if(temps[day] > average) {
                number_of_days_above_average++;
            }
        }
        return number_of_days_above_average;
    }
}
