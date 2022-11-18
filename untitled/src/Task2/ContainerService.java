package Task2;
import java.util.Scanner;

public class ContainerService {
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
    public void passingArguments(Container con)
    {
        Container cons = new Container();
        int [] arr1 = fillArray();
        cons.showContainer(arr1);
        int []arr2 = fillArray();
        cons.showContainer(arr2);
        System.out.println("По элементная разница массивов: ");
        con.showContainer(con.difference(arr1,arr2 ));
    }
}
