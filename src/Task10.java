import java.util.*;
import java.util.function.*;

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

        IntPredicate intPredicateEven = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        };

        IntPredicate intPredicateOdd = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 != 0;
            }
        };

        //Массив результат
        int[] arrayResultEven = Arrays.stream(array).filter(intPredicateEven).toArray();
        int[] arrayResultOdd = Arrays.stream(array).filter(intPredicateOdd).toArray();

        System.out.println("Подпоследовательность чётных чисел: " + Arrays.toString(arrayResultEven));
        System.out.println("Подпоследовательность нечётных чисел: " + Arrays.toString(arrayResultOdd));

        int[] arrayPositive = new int[count];
        int[] arrayNegative = new int[count];

        int countPositive = 0;
        int countNegetive = 0;

        for (int i = 0; i<array.length; i++) {
            if (array[i] > 0){
                arrayPositive[countPositive++] = array[i];
            } else if (array[i] < 0) {
                arrayNegative[countNegetive++] = array[i];
            }
        }

        System.out.println("Подпоследовательность положительных чисел: " + Arrays.toString(arrayPositive));
        System.out.println("Подпоследовательность отрицательных чисел: " + Arrays.toString(arrayNegative));

    }


}
