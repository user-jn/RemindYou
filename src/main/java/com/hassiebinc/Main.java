package com.hassiebinc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
        {
            // here is your code
            System.out.print("Welcome to the Remind You app\n\n");
            // System.out.println("");
            System.out.print("Don't forget to track your distance with the fitness app\n\n");
            // System.out.print("")
            System.out.print("Don't forget to stop by the store after work\n\n");

            // Variable Cheat Sheet

            //Data Types

            //String = Datatype

            // String appname = "RemindYou"; // Text
            //int number = 30;  // Whole number
            //double weight = 80.5; // Decimal number
            // boolean happy = true; // true or false
            //float salary = 2394.9592f; // Comma number with more decimal (f)
            //char firstLetter = 'R'; // 1 letter command

            // Store information
            // Your name
            // You age
            // Your weight
            // Dream Salary per month
            // firstLetterOfYourLastname
            // LovesGaming boolean

            String name = "Jack Naillon";
            int age = 28;
            double weight = 161.5;
            float salary = 300.0000f;
            char LastNameInitial = 'N';
            boolean LovesGaming = true;


            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight + " lbs");
            System.out.println("Salary: $" + salary);
            System.out.println("First Letter of Last Name: " + LastNameInitial);
            System.out.println("Do I love gaming? " + LovesGaming);


            //Extra: Challenge create your own data type
            String FavoriteFood = "Wings";
            System.out.println("Favorite Food: " + FavoriteFood);

        }
    }
