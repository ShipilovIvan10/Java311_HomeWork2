import java.net.SocketOption;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Задание 6: Перевести введённое количество метров в мили|дюймы|ядры в зависимости от выбора пользователя

        //Приглашение
        System.out.println("Ввдите количестов метров для конвертации:");

        //Объект для считываения кол-ва метров
        Scanner scannerMeter= new Scanner(System.in);

        //Кол-во метров
        int meters = scannerMeter.nextInt();

        //Приглашение ввести ед. измерения
        System.out.println("Введите цифру, соответствующую единице измерения, в которую нужно перевести метры.\n" +
                "Если в дюймы - 0, в ярды - 1, в мили - 2.");

        //Объект для считываения ед. изм-я, в которую нужно перевести
        Scanner scannerUnit = new Scanner(System.in);

        byte unit = scannerUnit.nextByte();

        String strRes;

        double result = switch (unit) {
            case 0: {
                strRes = "дюймы";
                yield meters * 1000 / 25.4;
            }
            case 1: {
                strRes = "ярды";
                yield meters / 0.9144;
            }
            case 2: {
                strRes = "мили";
                yield meters / 1609.34;
            }
            default:
                strRes = "Ошибка входного параметра";
                yield 0;
        };

        if (unit >= 0 && unit <= 2) {
            strRes = "Результат конвертации в " + strRes + " равен - " + result;
        }

        System.out.println(strRes);
    }
}