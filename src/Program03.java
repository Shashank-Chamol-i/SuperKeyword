class Anime
{
    void displayCategory()
    {
        System.out.println("Action : Adventure :");
    }
}
class OnePiece extends Anime
{
    void mainProtagnist()
    {
        super.displayCategory();
        System.out.println("Monkey.D.Luffy :");

    }
}
public class Program03 {
    public static void main(String[] args)
    {
        OnePiece op = new OnePiece();
        op.mainProtagnist();

    }
}
