package com.hassiebinc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
        {
            // display
            System.out.print("Welcome to the Remind You app\n\n");

            System.out.print("Don't forget to track your distance with the fitness app\n\n");

            System.out.print("Don't forget to stop by the store after work\n\n");

//        Create a Java program that stores the following information about yourself:
//        Your name
//        Your age
//        Your weight
//        Your dream salary per month
//        The first letter of your last name
//        Do you love gaming? (true or false)

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
