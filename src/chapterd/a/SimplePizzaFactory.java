package chapterd.a;

import chapterd.Pizza.CheesePizza;
import chapterd.Pizza.Pizza;
import chapterd.Pizza.VeggiePizza;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    }

    return pizza;
  }
}
