public class Player
{
    private static int count;
    private String name;
    private int unplacedArmies;

    public Player()
    {
        count++;
        System.out.print("Enter player " + count + "'s name: ");
        this.name = World.keyboard.nextLine();
        unplacedArmies = 3;
    }

    public String toString()
    {
        return name;
    }

    public void placeArmies(int armies, Territory territory)
    {
        unplacedArmies -= armies;
        territory.placeArmies(this, armies);
    }
}
