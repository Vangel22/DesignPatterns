package Factory;

public class FactoryTest {

    public static void main(String[] args) {
        //Object from the Factory class (OperatingSystemFactory) is created and used to manipulate the interface object
        //with the method that is used inside
        OperatingSystemFactory object = new OperatingSystemFactory();
        OS obj = object.getInstance("Open");
        obj.spec();
    }
}
