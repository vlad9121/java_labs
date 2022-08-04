import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Triangle extends Figure implements ForFigures { // Класс Треугольник
    private double s1, s2, s3;  // Поля стороны Треугольника
    public Triangle() { // Конструктор без параметров
        super();
    }
    public Triangle(double a, double b, double c, String colors) { // Конструктор с параметрами
         super(colors, Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c)));
         s1 = a;
         s2 = b;
         s3 = c;
    double p = (s1+s2+s3)/2; // Полупериметр треугольника
    double s = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3)); // По Формуле Герона вычисляем площадь
    }
    public String toString() {
        return "\n\tТреугольник со сторонами "+s1+", "+s2+", " + s3 +"\n\t" + "Цвет: " + getcolor()+"\n\t"+"Площадь: " + getarea();
    }
       public void ChangeParametrs() {
Scanner in = new Scanner(System.in);
System.out.print("Введите первую сторону треугольника: "); // Вводим с клавиатуры
s1 = in.nextDouble(); 
System.out.print("Введите вторую сторону треугольника: "); // Вводим с клавиатуры
s2 = in.nextDouble(); 
System.out.print("Введите третью сторону треугольника: "); // Вводим с клавиатуры
s3 = in.nextDouble(); 
Scanner c = new Scanner(System.in);
System.out.print("Укажите цвет: "); // Вводим с клавиатуры
String color = c.nextLine();  
super.setarea(Math.sqrt(((s1+s2+s3)/2)*(((s1+s2+s3)/2)-s1)*(((s1+s2+s3)/2)-s2)*(((s1+s2+s3)/2)-s3)));
super.setcolor(color);
    }
  public double GetArea() {
      return Math.sqrt(((s1+s2+s3)/2)*(((s1+s2+s3)/2)-s1)*(((s1+s2+s3)/2)-s2)*(((s1+s2+s3)/2)-s3));
  }
  public double GetPerimeter() {
      return s1+s2+s3;
  }
}