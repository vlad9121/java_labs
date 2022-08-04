import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab22 {
 public static void main(String[] args) {
int n = 5; // размер массива
int[][] arr = new int[n][n]; // двумерный массив
Random random = new Random(); // Генератор случайных чисел
System.out.println("Массив:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
arr[i][j] = random.nextInt(21); // Заполняем и выводим массив
System.out.printf("%4d\t", arr[i][j]);
}
System.out.println();
}
System.out.println("Изменённый массив:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
 if (i==j) {
     arr[i][j] = arr[i][j]*arr[i][j]; // Возводим элементы диагонали в квадрат
 }
System.out.printf("%4d\t", arr[i][j]);
}
System.out.println();
}
}
}