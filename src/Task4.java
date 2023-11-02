import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Задание 4: В введённом 6-ти значном числе поменять 1 и 6 цифру и 2 и 5. Если не 6-ти значное число - сообщить

        //Выведем приглашение
        System.out.println("Введите 6-ти значное число:");

        //Класс для считывания из консоли
        Scanner scanner = new Scanner(System.in);

        //Считтываем число
        int numb = scanner.nextInt();

        //Проверка на 6 знаков
        if (String.valueOf(numb).length() != 6){
            System.out.println("Введено не 6-ти значное число.\nВыполнение программы завершается!");
            System.exit(1);
        }

        //Выполнение задания
        //Способ №1: Через класс stringBuilder

        //Преобразуем число numb в строку методом toString() класса Integer
        // и передадим эту строку в конструктор класса stringBuilder и получим объект этого класса
        StringBuilder strBuilderOrigin = new StringBuilder(Integer.toString(numb));

        //Создадим объект stringBuilder для записи результата изменения числа
        //Строковая переменная str для конструктора
        String str = "";
        StringBuilder strBuilderResult = new StringBuilder(str);

        //На первую позицию результата помещается последняя цифра
        strBuilderResult.insert(0, strBuilderOrigin.charAt(5) );

        //На 2ю позицию результата - предпоследняя
        strBuilderResult.insert(1, strBuilderOrigin.charAt(4));

        //На 3-ю позицию - 3й символ
        strBuilderResult.insert(2, strBuilderOrigin.charAt(2));

        //На 4-ю - четвёртый
        strBuilderResult.insert(3, strBuilderOrigin.charAt(3));

        //На 5ю позицию - 2й символ исходного числа
        strBuilderResult.insert(4, strBuilderOrigin.charAt(1));

        //На последнюю 6-ю - первый исходной
        strBuilderResult.insert(5, strBuilderOrigin.charAt(0));

        //Вывод результата
        System.out.println("Результат: " + strBuilderResult);

        //Очистим результат и выполним с помощью цикла
        strBuilderResult.delete(0,6);

        //Способ 1.2. Также, но с помощью цикла

        //Переменная для номера цикла
        int indOrigin;
        for (int i = 0; i <= 5; i++){
            //3 и 4 символ не меняем
            if (i == 2 || i == 3) {
                indOrigin = i;
            } else { //Остальные инверсируем
                indOrigin = 5 - i;
            }

            strBuilderResult.insert(i, strBuilderOrigin.charAt(indOrigin));
        }

        //Вывод результата
        System.out.println("Результат: " + strBuilderResult);


        //Способ №2: через арифм. операции

        //Переменнвя результат
        int result = 0;

        //Шаг цикла
        int j = 0;

        //Степень 10 на которую нужно умножать получившуюся циферку
        int decr;

        while (numb > 0){

            //3 и 4 цифру реверсировать не нужно
            if (j==2 || j==3){
                decr = j;
            }
            else {
                decr = 5 - j;
            }

            //Размер разряда
            int numbRank = (int) Math.pow(10, decr);

            //Размер разряда в итоговом числе
            int numbRunkInv = (int) Math.pow(10, j);

            //Отделяем циферку и умножаем её на нужный порядок разряда
            int v = (numb / numbRank) * numbRunkInv;

            //System.out.println( v + "   " + numb );

            //Подсчитываем результат
            result += v;
            //Откидываем обработанную циферку
            numb %=  numbRank;
            //Шаг цикла
            j++;
        }

       //Вывод
        System.out.println("Результат: " + result);


    }
}
