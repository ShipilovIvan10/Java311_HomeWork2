import java.io.StringBufferInputStream;
import java.io.SyncFailedException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Задание №5: Введённое пользователем число, интерпретируем как номер месяца и выводим время года

        //Выведем приглашение пользователю ввести число:
        System.out.println("Введите номер месяца:");

        //Создадим объект для считывания из потока
        Scanner scanner = new Scanner(System.in);

        //Считаем число - номер месяца
        byte monthNumber = scanner.nextByte();

        //Используем оператор ветвления

        //Переменная результата
        String strResult = switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                yield "Winter";
            case 3:
            case 4:
            case 5:
                yield "Spring";
            case 6:
            case 7:
            case 8:
                yield "Summer";
            case 9:
            case 10:
            case 11:
                yield "Autumn";
            default:
                yield "Ошибка: введённое число не может быть номер месяца.";
        };

        if (monthNumber >= 1  && monthNumber <= 12) {
            strResult = "Введённый месяц относиться к времени года - " + strResult;
        }

        System.out.println(strResult);
    }
}