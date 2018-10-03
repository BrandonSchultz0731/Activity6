public class InteriorFeature implements Feature {

  String interiorFeature;

  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return interiorFeature;
  }

  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }
}
