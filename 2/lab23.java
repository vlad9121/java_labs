import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab23 {
 public static void main(String[] args) {
int[] arr1; // создаём массив
Scanner in = new Scanner(System.in);
System.out.print("Введите размерность массива: ");
int n = in.nextInt(); // задаём размер массива
System.out.print("Введите число a: ");
int a = in.nextInt();
System.out.print("Введите число b: ");
int b = in.nextInt();
arr1 = new int[n];
Random random = new Random(); // Генератор случайных чисел
System.out.println("Массив:");
for (int i = 0; i < arr1.length; i++) {
arr1[i] = random.nextInt(21); // Заполняем и выводим массив
System.out.print(arr1[i]+" ");
}
System.out.println();
System.out.println("Массив после преобразований:");
for (int i = 0; i < arr1.length; i++) {
if ((arr1[i]%2 == 0) && (i>a) && (i<b)) { // проверяем элемент по условию задания
if (i == 0 && arr1.length > 1) // исключение для первого элемент массива
    arr1[i]=arr1[i+1];
else if (i == arr1.length-1 && arr1.length > 1)  // исключение для второго элемента массива
    arr1[i] = arr1[i-1];
else if (i>0 && arr1.length > 1) {
    arr1[i] = arr1[i-1]+arr1[i+1]; // выполнение условия задачи
}
}
System.out.print(arr1[i]+" ");
}
}
}



