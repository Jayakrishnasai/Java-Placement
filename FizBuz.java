//Create game for Fizz,buzz and fizz buzz
//1. Fizz - the number divisible by 3
//2. Buzz - the number divisible by 5
//3. FizzBuzz - the number divisible by both 3 and 5
//Only the Divisible numbers should sholud print Fizz,Buzz, Fizz Buzz other wise it has to print  number
//inputs must be taken from user
//package com.fizzbuzz;
import java.util.Scanner;
public class FizBuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                        } else {
                            System.out.println(i);
                            }
                            }
                            }
                        }
