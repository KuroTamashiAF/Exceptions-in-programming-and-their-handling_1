package Task2;

public class Main {
    public static void pressButton(Container con)
    {
        ContainerService user = new ContainerService();
        user.passingArguments(con);
    }



    public static void main(String[] args) {
        Container con = new Container();
        pressButton(con);


    }
}
