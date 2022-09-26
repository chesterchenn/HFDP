package chapterc.b;

public abstract class Beverage {
  String description = "unknown Beverage";

  Boolean milk = false;

  Boolean soy = false;

  public String getDescription() {
    return description;
  }

  public Boolean getMilk() {
    return milk;
  }

  public void setMilk(Boolean milk) {
    this.milk = milk;
  }

  public Boolean getSoy() {
    return soy;
  }

  public void setSoy(Boolean soy) {
    this.soy = soy;
  }

  public double cost() {
    double cost = 0.0;

    if (getMilk()) {
      cost += 0.5;
    }
    if (getSoy()) {
      cost += 0.5;
    }

    return cost;
  }
}
