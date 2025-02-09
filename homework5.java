package shadenade62.lec1_8.fix;

public class homework5
{
    public static void main(String[] args)
    {
        // Example usage:
        printString("Hello, World!", 5);

        int[] array = {1, 6, 3, 8, 5, 10, 2};
        sumAndPrint(array);

        int[] myArray = new int[5]; // Create an array of size 5
        fillArray(7, myArray); // Fill the array with the number 7

        // Print the filled array
        System.out.print("Filled array: ");
        for (int num : myArray)
        {
            System.out.print(num + " ");
        }

        int[] my_Array = {1, 2, 3, 4, 5}; // Initial array
        increaseArrayElements(3, my_Array); // Increase each element by 3

        // Print the modified array
        System.out.print("Modified array: ");
        for (int num : my_Array)
        {
            System.out.print(num + " ");
        }


    }
    public static void printString(String str, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(str);
        }
    }

    public static void sumAndPrint(int[] numbers)
    {
        int sum = 0;
        for (int num : numbers)
        {
            if (num > 5)
            {
                sum += num;
            }
        }
            System.out.println("Sum of elements greater than 5: " + sum);
    }


    public static void fillArray(int number, int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = number;
        }
    }

    public static void increaseArrayElements(int number, int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] += number;
        }
    }

}
