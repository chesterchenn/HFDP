package chapterd.b;

import chapterd.Pizza.NYStyleCheesePizza;
import chapterd.Pizza.NYStyleVeggiePizza;
import chapterd.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new NYStyleVeggiePizza();
    } else return null;
  }
}
