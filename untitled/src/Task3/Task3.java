package Task3;

import java.util.Scanner;

public class Task3 {
    public int [] quotient  (int []arr1, int []arr2)
    {
        if (arr1.length !=arr2.length)
            throw new RuntimeException("Длина массивов не совпадает");
        int [] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]==0)
            {
                arr2[i]+=1;
            }
            arr3[i] = arr1[i]/arr2[i];
        }
        return arr3;
    }
    public int [] fillArray()
    {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr  = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }
}
