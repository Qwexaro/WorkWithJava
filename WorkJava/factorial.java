package WorkJava;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        int factorial = 1;
        try
        {
            int value = new Scanner(System.in).nextInt();
            System.out.print(value + "! = ");

            for (int i = 1; i <= value; i++)
                factorial = factorial * i;

            System.out.print(factorial);
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Вы должны ввести целое число!");
        }

    }
}