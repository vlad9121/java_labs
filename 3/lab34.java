import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab34 {
 public static void main(String[] args) {
 Date date = new Date(); // Получаем текущую дату
 System.out.println("Текущая дата: " + date.toString());
 Date date2 = new Date(date.getTime() + 1000000000); // К текущему времени прибавляем 1 000 000 секунд или 1 000 000 000 мс
 System.out.println("Дата через 1 000 000 секунд: " + date2.toString()); // Выводим дату и время через 1 000 000 секунд от текущей
}
}