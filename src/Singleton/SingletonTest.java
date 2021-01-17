package Singleton;

//Singleton can't be found as a keyword in Java, it's a concept

//Singleton means you can create only one instance of a class
public class SingletonTest {
    public static void main(String[] args) {
        //this means these two object can have different values
        //A obj1 = new A(); //new A() means you are calling the default constructor in A() -> this prevents the Singleton concept
        //The constructor in A should be restricted to allow new instance of the class
        //A obj2 = new A();
        //how to prevent second instance

        A obj = A.getInstance(); //this is how we enable Singleton
        //A obj = new A(); //This is not possible because i am using a private constructor
        System.out.println(obj.name);
        //Every time i call the A.getInstance and obj.name or declare another object i will get the same result
    }
}

class A{

    String name;

    //First step, create a static instance of this class
    static A obj = new A();

    //Second step, restricted constructor
    private A(){
        name = "Vangel Hristov";
    }

    //Third step, static method to get the object
    public static A getInstance(){
        return obj;
    }

}
