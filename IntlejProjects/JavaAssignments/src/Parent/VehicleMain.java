package Parent;

public class VehicleMain {

    public static void main(String args[])
    {
        Truck truck=new Truck("Bajaj",101,"oneTun");
        truck.vehicleDetails();

        Bus bus= new Bus("Mahendra",102,"tenPassenger");
        bus.vehicleDetails();
    }
}
