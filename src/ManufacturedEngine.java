import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "Generic";
    driveTrain = "Generic";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType,int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n"
        + "Engine Manufactured : " + engineManufacturedDate + "\n"
        + "Engine Make : " + engineMake + "\n"
        + "Engine Model : " + engineModel + "\n"
        + "Engine Type : " + engineType + "\n"
        + "Engine Cylinders : " + engineCylinders + "\n"
        + "Drive Train : " + driveTrain;
  }
}
