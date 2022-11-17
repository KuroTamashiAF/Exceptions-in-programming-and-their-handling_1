package Task2;

import java.util.Scanner;

public class Container {
    private int[] arr;
    private int size;
    private Scanner sc;

    public Container() {
        System.out.print("Введите вместимость контейнера: ");
        this.sc = new Scanner(System.in);
        this.size = sc.nextInt();
       this.arr = new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Container con1 = new Container();
    }
}
