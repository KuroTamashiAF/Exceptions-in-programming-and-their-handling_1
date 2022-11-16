package Task1.ObjectClasses;

public class Items {
    private String name;
    private float weight;

    public Items(String nam, float weight)
    {
        this.name = nam;
        this.weight = weight;
    }

    public Items(String name) {
        this.name = name;
        this.weight = 0;
    }
    public Items()
    {
        this.name = "N/A";
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
}
