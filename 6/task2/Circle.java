import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Circle extends Figure  implements ForFigures { // Класс Круг
    private double r;  // Поле радиус
    public Circle() { // Конструктор без параметров
        super();
    }
    public Circle(double radius, String colors) { // Конструктор с параметрами
            super(colors, radius*Math.PI);
         r = radius;
    double s =  r*Math.PI; // Площадь круга
    }
    public String toString() {
        return "\n\tКруг с радиусом "+ r +"\n\t" + "Цвет: " + getcolor()+"\n\t"+"Площадь: " + getarea();
    }
    public void ChangeParametrs() {
Scanner in = new Scanner(System.in);
System.out.print("Введите радиус круга: "); // Вводим с клавиатуры
r = in.nextDouble();
Scanner c = new Scanner(System.in);
System.out.print("Укажите цвет: "); // Вводим с клавиатуры
String color = c.nextLine();  
super.setarea(r*Math.PI);
super.setcolor(color);
    }
  public double GetArea() {
      return r*Math.PI;
  }
  public double GetPerimeter() {
      return 2*Math.PI*r;
  }
}