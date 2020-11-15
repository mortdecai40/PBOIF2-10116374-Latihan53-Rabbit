package pboif2.pkg10116374.latihan53.rabbit;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan perkenalan pada hewan
 *
 */
public class PBOIF210116374Latihan53Rabbit {
    private static String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        name = rabbit.getName();
        
        System.out.println("Hello, His name is " + name);
        System.out.println(name + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(name + " eats " + rabbit.getEats());
        System.out.println(name + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(name + " color is " + rabbit.getColor());
    }
    
}
