import java.util.Date;

public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;




  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleFrame();
    vehicleType = "Generic";
    driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  public void setEngineManufacturedDate(Date date) {
    this.vehicleManufacturedDate = date;
  }

  public void setEngineManufacturer(String manufacturer) {
    //this.vehicleManufacturer = manufacturer;
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  public void setEngineMake(String engineMake) {

    //this.vehicleMake = engineMake;
    vehicleEngine.setEngineMake(engineMake);
  }

  public void setEngineModel(String engineModel) {
    //this.vehicleModel = engineModel;
    vehicleEngine.setEngineModel(engineModel);
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public void setEngineType(String fuel) {

    //this.vehicleType = fuel;
    vehicleEngine.setEngineType(fuel);
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    this.vehicleType = vehicleChassis;
  }

  public String toString() {
    return "Manufacturer Name : " + vehicleManufacturer + "\n"
        + "Manufactured Date : " + vehicleManufacturedDate + "\n"
        + "Vehicle Make : " + vehicleMake + "\n"
        + "Vehicle Model : " + vehicleModel + "\n"
        + "Vehicle Type : " + vehicleType + "\n"
        + vehicleEngine.toString();
  }
}
