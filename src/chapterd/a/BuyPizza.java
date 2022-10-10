package chapterd.a;

import chapterd.Pizza.Pizza;

public class BuyPizza {
  public static void main(String[] args){
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

    Pizza cheesePizza = pizzaStore.orderPizza("cheese");
    Pizza veggiePizza = pizzaStore.orderPizza("veggie");
  }
}
