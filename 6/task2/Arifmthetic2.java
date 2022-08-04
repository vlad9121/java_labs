import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Arifmthetic2 extends Arifmthetic { // Дочерний класс
private double rezultat;

public Arifmthetic2() { // Конструктор без параметров
}
public void Rezultat(ForFigures figura1, ForFigures figura2) {
super.EnterOperator();
super.DisplayZagolovok();
switch(super.GetOperation()) {
    case '+':
    rezultat = figura1.GetArea()+figura2.GetArea();
    break;
    case '-':
    rezultat = figura1.GetArea()-figura2.GetArea();
    break;
    case '*':
    rezultat = figura1.GetArea()*figura2.GetArea();
    break;
    case '/':
    rezultat = figura1.GetArea()/figura2.GetArea();
    break;
};
    System.out.print(rezultat); // Вводим с клавиатуры
}
}
