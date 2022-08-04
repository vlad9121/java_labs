public abstract class Figure { // Абстрактный класс Фигура
private String color; // поле цвет фигуры
private double area; // поле площадь фигуры

public Figure(String c, double a) { // Конструктор с параметрами
   color = c;
   area = a;
}
Figure() { // Конструктор без параметров
}
public String getcolor() {
    return color;
}
public double getarea() {
    return area;
}
public String toString() {
    return "\n\tЦвет: " + color + "\n\t" + "Площадь: "+area+"\n"; 
}
}