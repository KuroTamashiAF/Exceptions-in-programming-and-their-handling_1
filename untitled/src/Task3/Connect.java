package Task3;

public class Connect {
    public void connection()
    {
        Task3 task = new Task3();
        int [] arr1 = task.fillArray();
        int [] arr2 = task.fillArray();
        task.quotient(arr1,arr2);
    }
}
