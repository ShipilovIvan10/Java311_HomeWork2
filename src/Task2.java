//библиотека, содержащая класс Scanner
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Задание 2: Считать 2 числа из консоли. Вывести процент, размером второго числа от первого числа

       //Выведем приглашение внести 2 числа
       System.out.println("Введите число и процент, который нужно получить от числа:");

        //Объекта Scanner для считывания из консоли
        Scanner scanner = new Scanner(System.in);

        //Считаем 2 числа
        int numb = scanner.nextInt();
        byte perc = scanner.nextByte();

        float result = (float) numb * perc / 100.0f;

        //Выведем результат
        System.out.println("Результат: " + result);

    }
}
