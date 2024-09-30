package shadenade62.lec1_8.fix;

import java.util.Scanner;

public class homework3
{
    public static void main(String[]args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1-5: ");
        int choice=scanner.nextInt();
        switch (choice)
        {
            case 1:
                greetings();
                break;
            case 2:
                checkSign();
                break;
            case 3:
                selectColor();
                break;
            case 4:
                CompareNumbers();
                break;
            case 5:
                addOrSubtractandPrint();
                break;
            default:
                System.out.println("error");
        }
        scanner.close();



    }

    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scanner.nextInt();
        System.out.println("Enter b: ");
        int b=scanner.nextInt();
        System.out.println("Enter c: ");
        int c=scanner.nextInt();
        int res=a+b+c;
        if (res>0)
        {
            System.out.println("the sum is positive");
        }
        else if (res==0)
        {
            System.out.println("the sum is equal to zero");
        }
        else
        {
            System.out.println("The sum is negative");
        }
    }

    public static void selectColor()
    {
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

        if(a>b)
        {
            System.out.println("a>b");
        }
        else if(a==b)
        {
            System.out.println("a=b");
        }
        else
        {
            System.out.println("a<b");
        }
    }
    public static void addOrSubtractandPrint()
    {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter initValue");
        int initValue=scanner1.nextInt();
        System.out.println("Enter delta");
        int delta=scanner1.nextInt();
        System.out.println("Enter boolean");
        boolean increment=scanner1.nextBoolean();

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
