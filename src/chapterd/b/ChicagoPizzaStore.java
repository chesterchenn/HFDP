package chapterd.b;

import chapterd.Pizza.ChicagoStyleCheesePizza;
import chapterd.Pizza.ChicagoStyleVeggiePizza;
import chapterd.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new ChicagoStyleVeggiePizza();
    } else return null;
  }
}
