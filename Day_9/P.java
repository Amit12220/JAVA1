package com.Day_9;
import java.util.Scanner;
abstract public class P {
    abstract void m1();
    abstract void m2();
    abstract void m3();
    int number;
}
class C extends P
{

    @Override
    void m1() {
        System.out.println(number);
    }

    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}
class Semo
{
    public static void main(String[] args) {
        C s1=new C();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter One Number Between 1 to 10");
        int x=sc.nextInt();
        if(x>0&&x<11)
        {
            s1.number=x;
            s1.m1();
        }
        else {
            System.out.println("Invalid Number");
        }

    }
}
