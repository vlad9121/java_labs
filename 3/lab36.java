import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class lab36 {
 public static void main(String[] args) throws ParseException {
Date date = new Date(); // Получаем текущую дату
SimpleDateFormat sdf = new SimpleDateFormat("y.M.d");
System.out.print("Текущая дата: " + sdf.format(date.getTime()));
}
}