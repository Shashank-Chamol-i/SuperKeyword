/*Example 2 Showing implementation of super keyword*/
class Vehicle
{
    String type;
    double rentalCost;
    Vehicle(String type,double rentalCost)
    {
        this.type = type;
        this.rentalCost = rentalCost;
    }
}
class Car extends Vehicle
{
    double extraCharge;
    Car(String type,double rentalCost,double extraCharge)
    {
        super(type,rentalCost);
        this.extraCharge = extraCharge;
    }
    void calculateTotal()
    {
        double totalCost = super.rentalCost+extraCharge;
        System.out.println("Total Cost : "+totalCost);
    }
}
public class Program02 {
    public static void main (String[] args){
        Car myCar = new Car("4 Veh",500.65,900.36);
        myCar.calculateTotal();
    }

}
