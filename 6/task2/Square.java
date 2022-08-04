import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Square extends Figure implements ForFigures { // Класс Квадрат
    private double a;  // Поле сторона квадрата
    public Square() { // Конструктор без параметров
        super();
    }
    public Square(double storona, String colors) { // Конструктор с параметрами
    super(colors, storona*storona);
         a = storona;
    double s =  a*a; // Площадь квадрата
    }
    public String toString() {
        return "\n\tКвадрат со стороной "+ a +"\n\t" + "Цвет: " + getcolor()+"\n\t"+"Площадь: " + getarea();
    }
       public void ChangeParametrs() {
Scanner in = new Scanner(System.in);
System.out.print("Введите сторону квадрата: "); // Вводим с клавиатуры
a = in.nextDouble(); 
Scanner c = new Scanner(System.in);
System.out.print("Укажите цвет: "); // Вводим с клавиатуры
String color = c.nextLine();  
super.setarea(a*a);
super.setcolor(color);
    }
  public double GetArea() {
      return a*a;
  }
  public double GetPerimeter() {
      return 4*a;
  }
}