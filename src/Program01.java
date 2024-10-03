/*Super Keyword use to refer to immediate parent class instance variable*/
class Animal
{
    String breed = "Labrador";
}
class Dog extends Animal
{
    String name = "Jameson";
   void printinfo()
   {
       System.out.println("Animal Breed : "+super.breed);
       System.out.println("Animal name : "+name);
   }
}
public class Program01 {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.printinfo();

    }

}
