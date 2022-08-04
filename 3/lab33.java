import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab33 {
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Введите текст: "); // Вводим строку с клавиатуры
String s = in.nextLine(); 
String[] k = s.split("\\ "); // Создаём массив string, где элемент - отдельное слово
System.out.println("Текст, разбитый на строки: ");
for (int i = 0; i < k.length; i++) {
    System.out.println(k[i]);
}
}
}

