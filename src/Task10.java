import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {

        //Задание 10: Считать массив из консоли и вывести.
        // На основании данных этого массива нужно:
        // Создать одномерный массив, содержащий только четные числа из первого массива;
        // Создать одномерный массив, содержащий только нечетные числа из первого массива;
        // Создать одномерный массив, содержащий только отрицательные числа из первого массива;
        // Создать одномерный массив, содержащий только положительные числа из первого массива.

        //Приглашение ввести количество элементов
        System.out.println("Введите количество элементов последовательности: ");

        //Объект сканер
        Scanner scanner = new Scanner(System.in);

        //Количество
        int count = scanner.nextInt();

        //Массив
        int[] array = new int[count];

        //Приглашение на последоваетльность
        System.out.println("Введите последовательность чисел: ");

        //Считываем массив
        for (int i = 0; i<count; i++){
            array[i] = scanner.nextInt();
        }

        IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value%2==0;
            }
        };

        //Массив результат
        int[] arrayResult = new int[count];


        arrayResult = Arrays.stream(array).filter(intPredicate).toArray();

        System.out.println(Arrays.toString(arrayResult));
      


    }


}
