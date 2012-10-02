public class Territory
{
    private int row;
    private int column;
    private Player owner;
    private int armies;

    public Territory(int column, int row)
    {
        this.column = column;
        this.row = row;
    }

    public String toString()
    {
        return "[" + column + "," + row + "]" + owner + "(" + armies + ")";
    }
    public Player getOwner()
    {
        return owner;
    }
    public void placeArmies(Player owner)
    {
        this.owner = owner;
        this.armies += 1;
    }
}
