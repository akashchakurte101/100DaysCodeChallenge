package Parent;

import Parent.Vehicle;

public class Truck extends Vehicle
{
    String capacity;
    public Truck(String name, int num,String capacity)
    {
        super(name, num);
        this.capacity=capacity;
    }

    public void vehicleDetails()
    {
        super.vehicleDetails();
        System.out.println("Capacity of truck "+capacity);

    }

}
