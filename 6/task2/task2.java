public class task2 {
public static void main(String[] args) {
ForFigures c1 = new Circle();
ForFigures s1 = new Square();
ForFigures t1 = new Triangle();
c1.ChangeParametrs();
System.out.println("Площадь круга " + c1.GetArea());
System.out.println("Периметр круга " + c1.GetPerimeter());
System.out.println(c1.toString());
s1.ChangeParametrs();
System.out.println("Площадь квадрата " + s1.GetArea());
System.out.println("Периметр квадрата " + s1.GetPerimeter());
System.out.println(s1.toString());
t1.ChangeParametrs();
System.out.println("Площадь треугольника " + t1.GetArea());
System.out.println("Периметр треугольника " + t1.GetPerimeter());
System.out.println(t1.toString());
Arifmthetic2 a1 = new Arifmthetic2();
a1.Rezultat(s1, t1);
}
} 