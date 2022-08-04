import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab32 {
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Введите текст: "); // Вводим строку с клавиатуры
String s = in.nextLine(); 
System.out.print("Введите символ: "); 
char c = in.next().charAt(0);;   // Вводим символ с клавиатуры
int count = 0; // Кол-во вхождений символа
for (int i = 0; i < s.length(); i++) {
    if (c == s.charAt(i))  // если символ в строке совпадает с заданным, увеличиваем счётчик
    count++;
}
System.out.print("Символ '" + c + "' входит в строку " + count + " раз");
}
}

