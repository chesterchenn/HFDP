package chapterd.c;

public interface PizzaIngreditentFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Clams createClam();
}
