package shadenade62.lec1_8.fix;

import java.util.Scanner;

public class homework3
{
    public static void main(String[]args)
    {
        greetings();
        int res = checkSign();
        if (res>=0)
        {
            System.out.println("the sum is positive");
        } else
        {
            System.out.println("The sum is negative");
        }
        selectColor();
        CompareNumbers();
        int initValue=10;
        int delta=5;
        boolean increment=true;
        addOrSubtractandPrint(initValue,delta,increment);
    }

    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static int checkSign()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scanner.nextInt();
        System.out.println("Enter b: ");
        int b=scanner.nextInt();
        System.out.println("Enter c: ");
        int c=scanner.nextInt();
        return a+b+c;
    }
    public static void selectColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int data = scanner.nextInt();
        if (data <= 10) {
            System.out.println("Red");
        } else if (data <= 20) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    public static void CompareNumbers()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scanner.nextInt();
        System.out.println("Enter b: ");
        int b=scanner.nextInt();
        if(a>=b)
        {
            System.out.println("a>=b");
        }
        else
        {
            System.out.println("a<b");
        }
    }
    public static void addOrSubtractandPrint(int initValue,int delta, boolean increment)
    {
        if(increment)
        {
            System.out.println(initValue+delta);
        }
        else
        {
            System.out.println(initValue-delta);
        }
    }
}
