package chapterd.b;

public class BuyPizza {
  public static void main(String[] args){
    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    nyPizzaStore.orderPizza("cheese");

    chicagoPizzaStore.orderPizza("veggie");
  }
}
