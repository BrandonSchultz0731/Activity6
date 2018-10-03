import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
  }

  public String getExteriorFeatures() {
    return "";
  }

  public String getInteriorFeatures() {
    return "";
  }
}
