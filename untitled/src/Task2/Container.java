package Task2;

public class Container {
    public int [] difference(int [] arr1, int [] arr2)
    {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длина массивов различна");
        else {
            int [] totalArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                totalArr[i] = arr1[i] - arr2[i];
            }
            return totalArr;                                   //хотел еще написать перегрузку operator- как на
        }                                                      // С++, но что то не нашел этого на просторах инета
    }
    public void showContainer(int []arr )
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
