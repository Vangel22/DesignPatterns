package Strategy;

public class AnimalPlay{

    //Two vital principles:
    //1. Eliminate duplicate code
    //2. Eliminate techniques where one class affect others

    //The strategy pattern should be used when you want to define a class that will have one behaviour that is
    //similar to other behaviours in a list

    /*In this example we used an interface and compositon of an object of the interface so we could use it in the
    * superclass Animal to add 2 methods that will manipulate the object from the interface that is passed (static and dynamic)
    *and then pass that interface object with the appropriate method in the Dog and Bird classes
    */

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}

