package chapterd.c;

public class NYPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    Pizza pizza = null;

    PizzaIngreditentFactory ingreditentFactory = new NYPizzaIngredientFactory();

    if (item.equals("cheese")) {
      pizza = new CheesePizza(ingreditentFactory);
      pizza.setName("New York Style Cheese Pizza");
    } else if (item.equals("clam")) {
      pizza = new ClamsPizza(ingreditentFactory);
      pizza.setName("New York Style Clams Pizza");
    }
    return pizza;
  }
}
