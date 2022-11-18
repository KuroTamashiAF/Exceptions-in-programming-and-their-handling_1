package Task2;

import java.util.Scanner;

public class ContainerService {
    public int [] fillArray()
    {
        System.out.print("Введите размерность 1 массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr  = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.random()*100;
        }
        return arr;
    }
}
