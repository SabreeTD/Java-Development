package com.pluralsight;
public class MathApp
{
    public static void main(String[] args) {
        //Question 1:
        //declare variables here
        //then code solution
        //then use System.out.println() to display results
        //ex: System.out.println("The answer is " + answer);

        // REPEAT FOR NEXT EXERCISE
        double bobSalary = 50000;
        double garySalary = 45000;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is" + highestSalary);

        double carPrice = 20000;
        double truckPrice = 40000;
        double minPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is" + minPrice);

        // Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is" + area);

        // Find and display the square root of a variable num1 after it is set to 5.0
        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of "+ num1 + "is" + sqrtNum1);
        // Find and display the distance between the points (5,10) and (85, 50)
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1,2));
        System.out.println("The distance between the points is " + distance);

        //Find and display the absolute (positive) value of num2 after it is set to -3.8
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + "is" + absNum2);

        // Find and display a random number between 0 and 1
        double randomNum = Math.random();
        System.out.println("The random number is" + randomNum);



    }




}
