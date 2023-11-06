import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        //Задание 11: Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
        //Метод принимает в качестве параметра: длину линии, направление, символ.

        //Объект для считывания из потока
        Scanner scanner = new Scanner(System.in);

        //Пришлашение ввести входные параметры
        System.out.println("Введите символ (без незначящих пробелов): ");
        String strChar = scanner.nextLine();

        System.out.println("Введите направление (1- горизонтальное, 2 - вертикальное): ");
        int direct = scanner.nextInt();

        System.out.println("Введите длину линии: ");
        int length = scanner.nextInt();

        //Результат
        StringBuilder strResult = new StringBuilder();

        //Вывод
        if (direct==1){
            for (int i=0; i <= length; i++) {
               strResult.append(strChar);
            }
        } else if (direct==2) {
            for (int i=0; i <= length; i++) {
                strResult.append(strChar).append("\n");;
            }
        }
        else {
            strResult.append("Введено не верное направление. Должно быть 1 или 2");
        }
        System.out.println(strResult);
    }
}
