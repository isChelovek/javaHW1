// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;


public class task1 
{
    public static void main(String[] args) 
{
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число n");
    int n = myLib.getIntMinMax(1, Integer.MAX_VALUE);
    System.out.printf("Сумма чисел от 1 до %d = %s \n", n, triangularNumber(n));
    System.out.printf("Факториал числа %d! = %s", n, factorial(n));
    iScanner.close();
}

    public static int triangularNumber(int n)
    {
        if (n == 0)
        {
            return 0;
        }
            else 
        {
            return n + triangularNumber(n - 1);
        }        
    }       

    public static int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
            else 
        {
            return n * factorial(n - 1);
        }
    }
}