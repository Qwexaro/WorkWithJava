package WorkJava;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        int attemp = 10000;
        while (attemp != value)
        {
            // трай кэтч использую чтобы не дать пользователю сломать программу при вводе не числа
            try
            {
                System.out.println("Введи число: ");
                attemp = new Scanner(System.in).nextInt();
                if (attemp > value) System.out.println("Загаданное меньше");
                if (attemp < value) System.out.println("Загаданное больше");
                if (attemp == value) System.out.println("Поздравляю вы угадали!");
            }
            catch (Exception InputMismatchException)
            {
                System.out.println("Вы должны ввести целое число!");
            }
        }
    }
}
