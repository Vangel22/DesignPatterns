package Template;

public class SandwichSculptor {

    public static void main(String[] args){

        Hoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        Hoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }

}
/*You make an abstract class and within this class you add the template method that contains series
  methods that every subclass object will call
* */
