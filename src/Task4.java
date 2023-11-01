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
        //Способ №1: Через класс stringBuiler
        
        StringBuilder strBuild = new StringBuilder(Integer.toString(numb));
        strBuild.

        //Способ №1: через арифм. операции

        //Переменнвя результат
        int result = 0;

        //Шаг цикла
        int i = 0;

        while (numb > 0){

            System.out.println(numb%(Math.pow(10,i))*(Math.pow(10, i-1)) + " " + numb);

            result += (int) ( numb % ( Math.pow(10,i)) * (Math.pow(10, i-1) ) );
            numb /= 10;
            i++;
        }

       //Вывод
        System.out.println("Результат: " + result);


    }
}
