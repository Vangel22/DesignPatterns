package Observer;

// The Observers update method is called when the Subject changes

public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}

//This can be seen as an subscriber on some Youtube channel