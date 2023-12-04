package interfacee;

public class AbcLmt implements RoadConstruction {

    String spec="10km";
    String name="Abc construction";

    public AbcLmt(String name)
    {
        this.name=name;
    }
    @Override
    public int duration() {
        return 15;
    }

    @Override
    public float budget() {
        return 1010f;
    }

    @Override
    public void takeRoadSpec(String spec) {
      this.spec=spec;
        System.out.println(this.spec);
    }


}
