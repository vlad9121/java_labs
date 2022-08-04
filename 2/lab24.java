import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab24 {
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Введите размер: ");
int n = in.nextInt(); // задаём размер массива
int[][] arr = new int[n][n]; // двумерный массив
Random random = new Random(); // Генератор случайных чисел
if (n%2!=0) { // Для нечётных n используем метод Делаира
for (int i = 0; i < n; i++) {
    arr[i][i] = (n-1)/2;
    for (int j = 0; j < n; j++) {
        if (j<(n-1)/2) {
            if (i+j+1<n)
            arr[i][i+j+1] = j;
            else 
            arr[i][i+j+1-n] = j;
        }
        else {
            if (j!=(n-1)/2) {
            if (j+i<n) 
            arr[i][i+j]=j;
            else 
            arr[i][i+j-n] = j;
            }
        }
        }
    }
 int[][] arr2 = new int[n][n];
 for (int i = 0; i<n; i++) {
     for (int j = 0; j<n; j++) {
         arr2[i][j] = arr[i][j]*n+arr[i][n-1-j]+1;
     }
 }
 System.out.println("Магический квадрат:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.printf("%4d\t", arr2[i][j]);
}
System.out.println();
}
}
else if (n%4 == 0) { // Для чётно-чётных используем метод Рауc-Болла
int now = 1;
int tmp = 0;
for (int i = 0; i<n; i++) {
    for (int j = 0; j < n; j++) {
        arr[i][j] = now;
        now++;
    }
}
for (int i = 0; i < n/2; i++) {
    tmp = arr[i][i];
    arr[i][i] = arr[n-i-1][n-i-1];
    arr[n-i-1][n-i-1] = tmp;
    tmp = arr[i][n-i-1];
    arr[i][n-i-1] = arr[n-i-1][i];
    arr[n-i-1][i] = tmp;
}
 System.out.println("Магический квадрат:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.printf("%4d\t", arr[i][j]);
}
System.out.println();
}
}
} 
}






