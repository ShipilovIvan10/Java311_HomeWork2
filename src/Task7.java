import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //Задание 7: На входе 2 числа. Вывести все нечётные числа из диапазона. При необходимости - нормализовать диапазон.

        //Приглашение
        System.out.println("Ввдите границы диапазона:");

        //Объект для считываения
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Итоговая последовательность
        StringBuilder strResult = new StringBuilder();

        //Нормализовать
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }

        while (a < b) {
            if (a % 2 == 1) {
                strResult.append(a).append(" ");
                a++;
            }
        }

        System.out.println("Нечётные числа в указанном диапазоне: " + strResult);
    }
}