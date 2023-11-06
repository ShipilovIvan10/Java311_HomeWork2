
import javax.sql.RowSet;
import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Task9 {

    public static void main(String[] args) {

        //Задание 9: Считать массив из консоли и вывести количество положительных, отрицательных и нулевых (именно нулей) элементов.

        //Приглашение
        System.out.println("Введите последовательность чисел, раздеоённых 1 пробелом:");

        //Объект для считывания потока из консоли
        Scanner scanner = new Scanner(System.in);

        //Запишем входные данные в встроку
        String strScanner = scanner.nextLine();

        int count = strScanner.length() - strScanner.replace(" ","").length();

        //Объявим переменную array типа массив целых чисел
        int[] array;
        //массив инициалтзация
        array = new int[count + 1];

        System.out.println(count);

        //Поместим эту строку в новый сканер потока
        Scanner scan = new Scanner(strScanner);

        //Зададим разделитель для содержимого сканера
        Scanner scanner1 = scan.useDelimiter(" ");

        //шаг цилка
        int i = 0;

        //В цикле считываем числа последовательности
        while (scanner1.hasNextInt()){
           array[i] = scanner1.nextInt();
           System.out.println(String.valueOf(array[i]) + " " + i);
           i++;
        }

        int countOfPositive = 0;
        int countOfNegative = 0;
        int countOfZero = 0;

        //Способ №1: Ручной способ

        //Количество положетельных.
        for (i = 0; i<= array.length - 1; i++){
            if (array[i]>0){
                countOfPositive++;
            } else if (array[i] < 0) {
                countOfNegative++;
            }
            else countOfZero++;
        }

        //Вывод результата
        System.out.println("Количество положительных элементов последовательности - " + countOfPositive);
        System.out.println("Количество отрицательных элементов последовательности - " + countOfNegative);
        System.out.println("Количество нулей в последовательности - " + countOfZero);


        //Вывод массива
        //System.out.println(Arrays.toString(array));
    }
}
