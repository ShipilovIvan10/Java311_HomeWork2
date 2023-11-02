import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //Задание 8: Показать таблицу уножения чисел из введённого диапазона пользователем

        System.out.println("Введите начальную и конечную границы диапазона чисел:");

        //Класс для считывания из консоли
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Нормальные границы
        if (a>b){
            int c = b;
            b = a;
            a = c;
        }

        //Стринг билдер для строки по каждому числу
        StringBuilder strBuilderDiv = new StringBuilder();

        while (a<=b) {
            for (int i=1; i<=10; i++){
                strBuilderDiv.append(a).append(" * ").append(i).append(" = ").append(a * i).append("   ");
            }
            System.out.println(strBuilderDiv);
            strBuilderDiv.delete(0, strBuilderDiv.length());
            a++;
        }
    }
}