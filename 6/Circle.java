public class Circle extends Figure { // Класс Круг
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
}