package HW2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
 * значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println("Вы ввели число: " + Task1.floatIO());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
        }
    }
    public static float floatIO(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            try{
                String temp = scanner.nextLine();
                return Float.parseFloat(temp);
            }catch (NumberFormatException ignored){

            }
        }
    }
}
