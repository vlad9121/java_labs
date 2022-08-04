import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class lab35 {
 public static void main(String[] args) throws ParseException {
Scanner in = new Scanner(System.in);
System.out.print("Введите первую дату и время в формате d-M-y H:m:s: "); // Вводим первую дату
String d1 = in.nextLine(); 
System.out.println();
System.out.print("Введите вторую дату и время в формате d-M-y H:m:s: "); // Вводим вторую дату
String d2 = in.nextLine(); 
SimpleDateFormat sdf = new SimpleDateFormat("d-M-y H:m:s");
Date date1 = sdf.parse(d1);
Date date2 = sdf.parse(d2);
System.out.println("Левый край: " + date1);
System.out.println();
System.out.println("Правый край: " + date2);
System.out.println();
long razn = date2.getTime()-date1.getTime(); // Вычитаем из второй даты первую
Random r = new Random();
razn = (long)(r.nextDouble()*razn); // Генерируем случайное значение
razn = razn+date1.getTime();
Date date3 = new Date(razn);
SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, d-M-y H:m:s");
System.out.print("Случайная дата в указанном интервале: " + sdf2.format(date3.getTime()));
}
}