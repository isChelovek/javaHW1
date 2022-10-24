// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Простые числа от 1 до 1000");
        printSimpleNumbers(1000);
        iScanner.close();
    }

    public static void printWithoutZeros(int[] printThis) {
        if (printThis.length != 0) {
            System.out.printf("[%d", printThis[1]); // кастыль
            for (int i = 2; i < printThis.length; i++) {
                if (printThis[i] != 0) {
                    System.out.printf(", %d", printThis[i]);  
                }
            }
            System.out.print("]");
        } else {
            System.out.print("the array is empty");
        }
    }

    public static void printSimpleNumbers(int n) {
        // Решето Эратосфена
        // https://ru.wikipedia.org/wiki/Решето_Эратосфена
        int[] a = new int[n + 1]; // Массив
        for (int i = 0; i < n + 1; i++)
        {
          a[i] = i;
        }

        for (int p = 2; p < n + 1; p++)
        {
            
          if (a[p] != 0)
          {
            for (int j = p*p; j < n + 1; j += p)
            {
              a[j] = 0;
            }
          }
        }
        printWithoutZeros(a);
    }
}
