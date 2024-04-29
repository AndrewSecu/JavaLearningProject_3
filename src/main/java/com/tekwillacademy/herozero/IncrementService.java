package com.tekwillacademy.herozero;

public class IncrementService {
    public static void main(String[] args) {

        int a = 1;

        a = a + 1;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a++;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        b = a++;
        System.out.println("b=" + b + ", a=" + a);

        b = ++a;
        System.out.println("b=" + b + ", a=" + a);

        a = 2;
        b = --a;
        System.out.println("b=" + b + ", a=" + a);

        a = 5;
        b = 3;
        b = a--;
        System.out.println("b=" + b + ", a=" + a);

        a = 9;
        b = 5;
        a = --b;
        System.out.println(b + " " + a + " String");


        int c = 65;
        c = a++;
        System.out.println("C = " + c + ", A=" + a);

        int f = 658;
        f = --a;
        System.out.println("F = " + c + ", A=" + a);

        a = 8;

        //i += 1 este identic cu i = i +1;
        for (int i = 0; i < a; i += 2) {
            System.out.println("Iteratie noua");
            if (i % 2 == 0) {
                System.out.println("Par:" + i);
            }
            System.out.println("Valoarea lui i este:" + i);
            System.out.println("Finish iteratie");
            System.out.println();
        }

        int i = 100000;
        int sum = 0;
        while (i > 0) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i--;
        }

        System.out.println();
        System.out.println(sum(5));
    }

    static int sum(int limit) {
        if (limit == 0) {
            return 1;
        } else {
            System.out.println("Iteratie:" + limit);
            return limit;
        }
    }

}
