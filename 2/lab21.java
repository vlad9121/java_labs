import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class lab21 {
 public static void main(String[] args) {
int[] arr1, arr2; // создаём два массива, первоначальный и изменённый
Scanner in = new Scanner(System.in);
System.out.print("Введите размерность массива: ");
int n = in.nextInt(); // задаём размер массива
arr1 = new int[n];
int count = n; // кол-во элементов нового массива
int now = 0; // текущая позиция в первоначальном массиве
Random random = new Random(); // Генератор случайных чисел
System.out.println("Массив:");
for (int i = 0; i < arr1.length; i++) {
arr1[i] = random.nextInt(21); // Заполняем и выводим массив
System.out.print(arr1[i]+" ");
if (arr1[i] == 0) {  // Подсчитываем элементы в новом массиве
    count--; 
}
if (arr1[i]%10 == 5) {
    count++;
}
}
arr2 = new int[count]; // Присваиваем новому массиву размер
int k = 0; // Переменная текущего индекса нового массива
    while (now < arr1.length) { // Проходим по начальному массиву
        if ((arr1[now]!=0) && ((arr1[now]%10) != 5)) {
            arr2[k] = arr1[now];  // Если элемент массива не удовлетворяет условиям, просто записываем его в новый
            k++;
        }
    if (arr1[now]%10 == 5) {
        arr2[k] = arr1[now];  // Если элемент массива оканчивается на 5, то добавляем после него единицу
        arr2[k+1] = 1;
        k = k+2;
    }
    now++;
    }
    System.out.println();
    System.out.println("Массив после преобразований:");
for (int j = 0; j < arr2.length; j++) {
System.out.print(arr2[j]+" "); // Вывод нового массива
}
arr1 = null; // Избавляемся от старого массива
System.gc(); // Очищаем память
}
}


