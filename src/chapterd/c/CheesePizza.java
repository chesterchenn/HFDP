package chapterd.c;

public class CheesePizza extends Pizza {
  PizzaIngreditentFactory ingreditentFactory;

  public CheesePizza(PizzaIngreditentFactory ingreditentFactory) {
    this.ingreditentFactory = ingreditentFactory;
  }

  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingreditentFactory.createDough();
    sauce = ingreditentFactory.createSauce();
    cheese = ingreditentFactory.createCheese();
  }
}
