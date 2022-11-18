package Task2;

public class Container {
    public int [] sum (int [] arr1, int [] arr2)
    {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длина массивов различна");
        else {
            int [] totalArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                totalArr[i] = arr1[i] - arr2[i];
            }
            return totalArr;
        }
    }
    public void showContainer(int []arr )
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }


//    public static void main(String[] args) {
//        Container uwer = new Container();
//        int arr5[] = {1,2,3,4,5};
//        int arr6[] = {1,2,3,4,5};
//        uwer.showContainer(uwer.sum(arr5,arr6));
//
//
//
//    }
}
