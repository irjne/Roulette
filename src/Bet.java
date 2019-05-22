public class Bet
{
    public enum Number
    {
        EVEN,
        ODD
    }

    public enum Typology
    {
        NUMBER,
        COLOR,
        EVENORODD
    }

    private Typology type;
    private Number number = null;
    private int value = -1;
    private Sector.Color color = null;
    private double instalment;

    public Bet(Number number, double instalment)
    {
        this.type = Typology.EVENORODD;
        this.number = number;
        this.instalment = instalment;
    }

    public Bet(int value, double instalment)
    {
        this.type = Typology.NUMBER;
        this.value = value;
        this.instalment = instalment;
    }

    public Bet(Sector.Color color, double instalment)
    {
        this.type = Typology.COLOR;
        this.color = color;
        this.instalment = instalment;
    }

    public Number getNumber() {return number;}
    public int getValue() {return value;}
    public Sector.Color getColor() {return color;}
    public double getInstalment() {return instalment;}
    public Typology getType() {return type;}
}