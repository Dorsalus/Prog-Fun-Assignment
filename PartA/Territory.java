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

    public void placeArmies(Player owner, int armies)
    {
        this.owner = owner;
        this.armies += armies;
    }
}
