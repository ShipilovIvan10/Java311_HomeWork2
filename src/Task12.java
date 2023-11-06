import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        //Задание 12: Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора пользователя.

        //Объект для считывания из потока
        Scanner scanner = new Scanner(System.in);

        //Пришлашение ввести входные параметры
        System.out.println("Введите количество элементов последовательности: ");
        int count = scanner.nextInt();

        int[] array = new int[count];

        int i = 0;

        System.out.println("Введите последовательность: ");
        while (i<count) {
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Введите напрвление упорядочивания последовательности (1 - по убыванию с повт., 2 - по возрастанию с повт.): ");

        byte d = scanner.nextByte();

        int tmp;

        if (d == 1) {
            for (i = 0; i < array.length-1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        } else {
            Arrays.sort(array);
        }
        System.out.println(Arrays.toString(array));
    }
}
