import java.util.ArrayList;

public class Player
{
    private int id;
    private double credit;
    private Bet bet;

    public Player(int id, double credit)
    {
        this.id = id;
        this.credit = credit;
    }

    public void setBet(Bet bet) {this.bet = bet;}

    public void setCredit(double credit) {this.credit = credit;}
    public double getCredit() {return credit;}
    public Bet getBet() {return bet;}
}