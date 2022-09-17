package com.Day_9;

public class Bean {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    Bean() {

    }

    public void displayDetails(int roll, String name, int marks) {

        Bean c1 = new Bean();
        c1.roll = roll;
        c1.name = name;
        c1.marks = marks;
        System.out.println("Name-" + c1.name + " " + "Roll-" + c1.roll + " " + "Marks-" + c1.marks);
        System.out.println("Grade-" + calculateGrade(marks));
    }

    private char calculateGrade(int marks) {
        if (marks >= 500) {
            grade = 'A';
        }
        if (marks < 500 && marks >= 400) {
            grade = 'B';
        }
        if (marks < 400) {
            grade = 'C';
        }
        return grade;
    }
}
class Demo
{
    public static void main(String[] args) {

        Bean s1=new Bean();
        Bean s2=new Bean();
       s1.displayDetails(101,"Amit",509);
        s2.displayDetails(102,"Sumit",400);
    }
}


