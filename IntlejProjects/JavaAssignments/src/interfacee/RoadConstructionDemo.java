package interfacee;

public class  RoadConstructionDemo {
    public static void main(String[] args)
    {
        RoadConstruction vendor=roadContracter();
        vendor.takeRoadSpec("10 km......");
        System.out.println(vendor.duration());
        System.out.println(vendor.budget());

    }

    public static RoadConstruction roadContracter()
    {
        RoadConstruction vedor1=new AbcLmt("ABC devlopers");
        return vedor1;
    }
}
