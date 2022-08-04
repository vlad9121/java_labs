public class Triangle extends Figure { // Класс Треугольник
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
}