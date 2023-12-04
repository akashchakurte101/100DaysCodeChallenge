package Parent;

public class Vehicle {

    public String vehicleName;
    public int vehicleNumber;

    public Vehicle(String name,int num)
    {
        this.vehicleName=name;
        this.vehicleNumber=num;
    }
    public void vehicleDetails()
    {
        System.out.println(vehicleName+" & "+vehicleNumber);
    }

}
