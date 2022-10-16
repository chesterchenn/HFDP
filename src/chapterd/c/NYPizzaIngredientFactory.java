package chapterd.c;

public class NYPizzaIngredientFactory implements PizzaIngreditentFactory {
  @Override
  public Dough createDough() {
    return new ThinCustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Clams createClam() {
    return new FreshClams();
  }
}
