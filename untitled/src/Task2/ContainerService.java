package Task2;
import Task2.Container;
import java.util.Scanner;

public class ContainerService {
    public int [] fillArray()
    {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr  = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.random()*100;
        }
        return arr;
    }
    public void passingArguments(Container con)
    {
        int [] arr1 = fillArray();
        int []arr2 = fillArray();
        con.showContainer(con.sum(arr1,arr2 ));
    }
}
