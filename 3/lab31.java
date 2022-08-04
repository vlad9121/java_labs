import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab31 {
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Введите текст: "); // Вводим строку с клавиатуры
String s = in.nextLine(); 
String reversedString = new StringBuffer(s).reverse().toString(); // Используем класс StringBuffer и его метод reverse для вывода строки в обратном порядке
System.out.print("Изменённый текст: ");
System.out.println(reversedString);
}
}


