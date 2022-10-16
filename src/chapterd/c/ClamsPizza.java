package chapterd.c;

public class ClamsPizza extends Pizza {
  PizzaIngreditentFactory ingreditentFactory;

  public ClamsPizza(PizzaIngreditentFactory ingreditentFactory) {
    this.ingreditentFactory = ingreditentFactory;
  }

  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingreditentFactory.createDough();
    sauce = ingreditentFactory.createSauce();
    cheese = ingreditentFactory.createCheese();
    clam = ingreditentFactory.createClam();
  }
}
