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
    
    public int getUnplacedArmies()
    {
        return unplacedArmies;
    }

    public void placeArmies(Territory territory)
    {
        unplacedArmies -= 1;
        territory.placeArmies(this);
    }
}
