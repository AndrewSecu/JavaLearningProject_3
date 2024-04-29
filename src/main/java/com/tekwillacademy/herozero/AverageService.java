package com.tekwillacademy.herozero;

public class AverageService {

    public static double average(int min, int max){
        if (min > max) {
            System.out.println("Min should be less than max");
            return 0;
        }

        int sum = 0;
        for (int i = min; i<= max; i++){
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        int diffCounter = max - min + 1;
        double avg = (double) sum / diffCounter;

       return avg;
    }

    public static double average(int limit){
        if (0 > limit) {
            System.out.println("Min should be less than max");
            return 0;
        }

        int sum = 0;
        for (int i = 0; i<= limit; i++){
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        double avg = (double) sum / limit;

        return avg;
    }
}
