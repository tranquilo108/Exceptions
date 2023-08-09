package HW2;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        isEmptyString();
    }
    public static void isEmptyString(){
        System.out.println("Введите текст: ");
        try (Scanner scanner = new Scanner(System.in)){
            String string = scanner.nextLine().split("")[1];
        }catch (IndexOutOfBoundsException e){
            System.err.println("Пустые строки вводить нельзя");
        }
    }
}
