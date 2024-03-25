package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bas_price = 40;
        int price = calculatePrice(bas_price);
        System.out.println("Input your city");
        String city = sc.next();
        System.out.println("Input your age");
        int age = sc.nextInt();
        System.out.println("Input what day it is");
        String day = sc.next();
        calculateAndPrintTicketInfo(city, age, day, price);
    }

    public static int calculatePrice(int basePrice) {
        return basePrice / 2;
    }

    public static double calculateDiscountedPrice(int price, String city) {
        double discount = 0.5;
        if (city.equals("Warsaw")) {
            discount = 0.55;
        }
        return price - (price * discount);
    }

    public static void calculateAndPrintTicketInfo(String city, int age, String day, int price) {
        if (age < 10) {
            System.out.println("Admission is free");
        } else if (age > 10 && age <= 18) {
            System.out.println("Data:" + city + "," + age + " years old, Price: " + price + "\n" + "Discount is 50%");
            if (city.equals("Warsaw")) {
                double discountedPrice = calculateDiscountedPrice(price, city);
                System.out.println("Data:" + city + "," + age + " years old, Price: " + discountedPrice + "\n" + "Discount is 55%");
            }
        } else {
            if (day.equals("Thursday")) {
                System.out.println("Admission is free");
            }
        }
    }
}
