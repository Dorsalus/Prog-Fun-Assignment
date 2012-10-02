import java.util.Scanner;

public class World
{
    public static final Scanner keyboard = new Scanner(System.in);

    private Territory territory1;
    private Territory territory2;
    private Territory territory3;
    private Territory territory4;
    private Player player1;
    private Player player2;

    public World()
    {
        territory1 = new Territory(0, 0);
        territory2 = new Territory(1, 0);
        territory3 = new Territory(0, 1);
        territory4 = new Territory(1, 1);
        player1 = new Player();
        player2 = new Player();
    }

    public String toString()
    {
        return territory1 + " " + territory2 + " " + territory3 + " " + territory4;
    }

    public void placeArmies(Player player, Territory territory)
    {
        System.out.print("How many armies would you like to place on " + territory + "? ");
        int armies = keyboard.nextInt();
        player.placeArmies(armies, territory);
        System.out.println(this);
    }

    public void run()
    {
        System.out.println(player1 + ", please place your armies");
        System.out.println(this);
        placeArmies(player1, territory1);
        placeArmies(player1, territory2);
        System.out.println(player2 + ", please place your armies");
        System.out.println(this);
        placeArmies(player2, territory3);
        placeArmies(player2, territory4);
    }
}
