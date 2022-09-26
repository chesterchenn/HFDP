package chapterc.b;

public class Person {
  public static void main(String[] args) {
    // 实例化一个对象测试
    DarkRoast darkRoast = new DarkRoast();
    darkRoast.setMilk(true);
    darkRoast.cost();
    printCoffee(darkRoast);

    // 实例化一个对象测试
    HouseBlend houseBlend = new HouseBlend();
    houseBlend.setMilk(true);
    houseBlend.setSoy(true);
    houseBlend.cost();
    printCoffee(houseBlend);
  }

  static void printCoffee(Beverage beverage) {
    String hasMilk = beverage.getMilk() ? "1 Milk, " : "0 Milk, ";
    String hasSoy = beverage.getSoy() ? "1 Soy, " : "0 Soy, ";
    double cost = beverage.cost();
    System.out.println(beverage.getDescription() + " " + hasMilk + hasSoy + cost + " Yuan");
  }
}
