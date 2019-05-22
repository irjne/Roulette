public class Main
{
    public static void main(String[] args)
    {
        Roulette game = new Roulette();
        Player player = new Player (15, 145.80);

        System.out.println(game);

        Bet bet = new Bet (5, 30);
        player.setBet(bet);

        Sector result = game.extraction();
        System.out.println("Extracted number: " + result.getNumber() + ".");

        if (game.checkWinner(player, result)) System.out.println("You win! Your actual credit is: € " + player.getCredit());
        else System.out.println("You lose. Your actual credit is: € " + player.getCredit());

        bet = new Bet (Sector.Color.R, 30);
        player.setBet(bet);

        result = game.extraction();
        System.out.println("Extracted number: " + result.getNumber() + ".");

        if (game.checkWinner(player, result)) System.out.println("You win! Your actual credit is: € " + player.getCredit());
        else System.out.println("You lose. Your actual credit is: € " + player.getCredit());

        bet = new Bet (Bet.Number.EVEN, 30);
        player.setBet(bet);

        result = game.extraction();
        System.out.println("Extracted number: " + result.getNumber() + ".");

        if (game.checkWinner(player, result)) System.out.println("You win! Your actual credit is: € " + player.getCredit());
        else System.out.println("You lose. Your actual credit is: € " + player.getCredit());

    }
}