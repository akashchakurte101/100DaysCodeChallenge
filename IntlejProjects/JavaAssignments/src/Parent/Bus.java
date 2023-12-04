package Parent;

import Parent.Vehicle;

public class Bus extends Vehicle {

    String passenger;
    public Bus(String name, int num,String passenger)
    {
        super(name, num);
        this.passenger=passenger;
    }

    public void vehicleDetails()
    {
        super.vehicleDetails();
        System.out.println("Number of passengers  "+ passenger);
    }
}
