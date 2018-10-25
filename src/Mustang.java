public class Mustang implements Horses
{
    private String name;
    private int weight;

    public Mustang (String name, int weight)
    {
        this.name=name;
        this.weight=weight;
    }
    private String getName(String name)
    {
        return this.name;
    }
    private int getWeight(int weight)
    {
        return this.weight;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
