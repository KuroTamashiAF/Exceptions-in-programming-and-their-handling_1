package Task3;

import Task2.Container;
import Task2.ContainerService;

public class Main {
    public static void pressButton(Task2.Container con)
    {
        Task2.ContainerService user = new ContainerService();
        user.passingArguments(con);
    }
    public static void main(String[] args) {
        Task2.Container con = new Container();
        pressButton(con);


    }
}
