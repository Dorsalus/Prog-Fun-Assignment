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

//     public void placeArmies(Player player, Territory territory)
//     {
//         System.out.print("How many armies would you like to place on " + territory + "? ");
//         int armies = keyboard.nextInt();
//         player.placeArmies(armies, territory);
//         System.out.println(this);
//     }

    public void placeArmies(Player player)
    {
        System.out.println("You have " + player.getUnplacedArmies() + " to place.");
        System.out.println(this);
        System.out.print("Select a Territory: ");
        int column = keyboard.nextInt();
        int row = keyboard.nextInt();
    }

 
}
