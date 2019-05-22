public class Sector
{
    public enum Color
    {
        G,
        R,
        B
    }

    private int number;
    private Color color;

    public Sector(int number, Color color)
    {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {return number;}
    public Color getColor() {return color;}
}
