package WorkJava;

import java.util.Scanner;
public class para {
    public static void main(String[] args) {
        System.out.println("Введи число я покажу его множителеи: ");
        try
        {
            int x = new Scanner(System.in).nextInt();
            for (int i = 1; i <= x; i++) {
                for (int j = x; j >= 1; j--) {
                    if (i * j == x) {
                        System.out.println(i + " * " + j);
                    }
                }
            }
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Вы должны ввести целое число!");
        }
    }
}