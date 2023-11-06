import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Задание №3: Из 3 цифр, введённых из клавиатуры, скомпоновать число

        //Выведем приглашение пользователю
        System.out.println("Введите 3 цифры, из которых будет составлено число: ");

        //Создадим объект для считывания из консоли
        //System - класс, in - поле класса, содержащее объект (входн)
        Scanner scanner = new Scanner(System.in);

        //Считаем три цифры
        byte d1 = scanner.nextByte();
        byte d2 = scanner.nextByte();
        byte d3 = scanner.nextByte();

        //Вариант решения №1: составим число по разрядам
        int result = d1*100 + d2*10 + d3;

        System.out.println("Число, составленное из введённых цифр (вариант №1): " + result);

        //Вариант решения №2: через строку
        //Итоговая строка
        String strResult = String.valueOf(d1) + String.valueOf(d2) + String.valueOf(d3);

        System.out.println("Число, составленное из цифр (способ №2): " + strResult);
    }
}
