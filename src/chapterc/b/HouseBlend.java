package chapterc.b;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "Most Excellent House Blend";
  }

  @Override
  public double cost() {
    return 1.0 + super.cost();
  }
}
