package Decorator;

// Blueprint for classes that will have decorators

public interface Pizza {

    public String getDescription();

    public double getCost();

}


/*
public abstract class Pizza{


	public abstract void setDescription(String newDescription);
	public abstract String getDescription();

	public abstract void setCost(double newCost);
	public abstract double getCost();

	// I could use getter and setter methods for every
	// potential Pizza topping

}
*/

/*The point with abstract class is that we will use it in every class and then
* if we want to change getCost() value, let us say 10$ to 20$ then we must change the code
* for getCost() in every subclass
* */

//with ABSTRACT class we have INHERITANCE -> inheritance is static
//COMPOSITION is dynamic
