public class Square extends Figure { // Класс Квадрат
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
}