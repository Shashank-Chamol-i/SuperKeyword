class House
{
    int rooms;
    int bathroom;
    int kitchen;
    House(int rooms ,int bathroom,int kitchen)
    {
        this.rooms = rooms;
        this.bathroom = bathroom;
        this.kitchen =kitchen;
        System.out.println("Rooms : "+this.rooms+" Bathroom : "+this.bathroom+" Kitchen : "+this.kitchen);
    }
}
class Garage extends House
{
   boolean gar;
   Garage(int room,int bathroom,int kitchen ,boolean gar)
   {
       super(room,bathroom,kitchen);
       this.gar = gar;
       System.out.println("The property possess the facility of Garage : "+this.gar);
   }
}

public class Program04 {
    public static void main(String[] args)
    {
        Garage prop = new Garage(3,1,1,true);

    }
}
