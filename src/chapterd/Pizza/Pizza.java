package chapterd.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  // 每个披萨都具有名称、面团类型、酱料类型，一套佐料
  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing: " + dough);
    System.out.println("Adding: " + sauce);
    System.out.print("Adding toppings:");
    for (Object topping : toppings) {
      System.out.println(" " + topping);
    }
  }

  public void bake() {
    System.out.println("Bake the Pizza!");
  }

  public void cut() {
    System.out.println("Cutting the Pizza!");
  }

  public void box() {
    System.out.println("Box the Pizza!");
  }

  public String getName() {
    return name;
  }

}
