import java.util.*;
import java.util.Random;
import java.util.Scanner;
public abstract class Arifmthetic { // Суперкласс
private char ch; // оператор;

public Arifmthetic() { // Конструктор без параметров
}
public void EnterOperator() {
Scanner in = new Scanner(System.in);
System.out.print("Введите арифметическую операцию(+,-,* или /) "); // Вводим с клавиатуры
ch = in.next().charAt(0);
}
public void DisplayZagolovok() {
    System.out.print("Арифметическая операция: " + ch + "\nРезультат операции: ");
}
public char GetOperation() {
return ch;
}
}