package chaptera.b;

public class RubberDuck extends Duck {
  public static void main(String[] args) {
    RubberDuck rubber = new RubberDuck();
    rubber.quack();
    rubber.swim();
    rubber.display();
    rubber.fly();
  }

  @Override
  public void quack() {
    System.out.println("zhi zhi");
  }

  @Override
  public void display() {
    System.out.println("I'm a Rubber Duck!");
  }

  @Override
  public void fly() {}
}
