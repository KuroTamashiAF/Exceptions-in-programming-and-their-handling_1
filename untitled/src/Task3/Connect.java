package Task3;

public class Connect {
    public void connection()
    {
        Task3 task = new Task3();
        int [] arr1 = task.fillArray();
        task.showArr(arr1);
        int [] arr2 = task.fillArray();
        task.showArr(arr2);
        task.showArr(task.quotient(arr1,arr2));
    }
}
