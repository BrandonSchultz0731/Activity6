import java.util.Date;

public class Main {

  public static void main(String[] args) {
    VehicleChassis vc1 = new VehicleChassis();
    VehicleChassis vc2 = new VehicleChassis("V12");

    VehicleFrame vf1 = new VehicleFrame();
    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vc1.toString());
    System.out.println(vc2.toString());
    System.out.println(vf1.toString());
    System.out.println(vf2.toString());
    System.out.println();

    ManufacturedEngine me1 = new ManufacturedEngine();
    ManufacturedEngine me2 = new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1", 4, "88",
        "driveTrain");
    System.out.println(me1.toString());
    System.out.println(me2.toString());
    InteriorFeature if1 = new InteriorFeature();
    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if1.toString());
    System.out.println(if2.toString());
    ExteriorFeature ef1 = new ExteriorFeature();
    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef1.toString());
    System.out.println(ef2.toString());
    System.out.println();
    System.out.println();
    Vehicle v1 = new Vehicle();
    Vehicle v2 = new Vehicle(new Date(),"Honda","Honda","Prelude",new Vehicle(),"None","2WD",new Vehicle());
    System.out.println(v1.toString());
    System.out.println(v2.toString());

  }
}
