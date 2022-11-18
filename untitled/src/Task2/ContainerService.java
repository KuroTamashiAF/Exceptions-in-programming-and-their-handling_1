package Task2;
import java.util.Scanner;

public class ContainerService {
    public int [] fillArray()
    {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();                            // вот тут бы добавить проверку на то что
        int [] arr  = new int[size];                        // ввел ли пользователь число, а не белеберду
        for (int i = 0; i < arr.length; i++) {              // но я не пойму как...
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
