import java.util.ArrayList;

public class Roulette
{
    private ArrayList<Sector> disk;

    public Roulette()
    {
        this.disk = new ArrayList<Sector>();

        this.disk.add(new Sector(0, Sector.Color.G));

        for (int i=0; i<36; i++)
        {
            Sector sector;
            if (i!=0 && this.disk.get(i).getColor().equals(Sector.Color.B)) sector = new Sector(i+1, Sector.Color.R);
            else sector = new Sector(i+1, Sector.Color.B);

            this.disk.add(sector);
        }
    }

    @Override
    public String toString()
    {
        String result = "";
        result+= "| \t\t    " + this.disk.get(0).getNumber() + " (" + this.disk.get(0).getColor() + ")   \t\t|\n";

        for (int i=1; i<this.disk.size(); i++)
        {
            if (i<10) result+= "|  " + this.disk.get(i).getNumber() + " (" + this.disk.get(i).getColor() + ") ";
            else result+= "| " + this.disk.get(i).getNumber() + " (" + this.disk.get(i).getColor() + ") ";
            if ((i)%3==0) result+= "|\n";
        }
        return result;
    }

    public Sector extraction ()
    {
        Random random = new Random ();
        int extraction = random.nextInt(36);
        //int extraction = (int)(Math.random()*37);

        if (extraction >= 0 && extraction <= 37)
        {
            return this.disk.get(extraction);
        }
        else
        {
            extraction();
        }
        return null;
    }

    public boolean checkWinner (Player player, Sector extraction)
    {
        if (player.getBet().getType().equals(Bet.Typology.NUMBER) && player.getBet().getValue() == extraction.getNumber())
        {
            player.setCredit(player.getCredit() + (player.getBet().getInstalment()*36));
            return true;
        }

        if (player.getBet().getType().equals(Bet.Typology.COLOR) && player.getBet().getColor().equals(extraction.getColor()))
        {
            player.setCredit(player.getCredit() + (player.getBet().getInstalment()*2));
            return true;
        }

        if (player.getBet().getType().equals(Bet.Typology.EVENORODD) && (player.getBet().getNumber().equals(Bet.Number.EVEN) && extraction.getNumber()%2==0 || player.getBet().getNumber().equals(Bet.Number.ODD) && extraction.getNumber()%2!=0))

        player.setCredit(player.getCredit() - player.getBet().getInstalment());
        return false;
    }
}


