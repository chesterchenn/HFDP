package chaptera.c;

public class RubberDuck extends Duck implements Quackable {
  public static void main(String[] args) {
    RubberDuck rubber = new RubberDuck();
    rubber.quack();
    rubber.swim();
    rubber.display();
  }

  @Override
  public void quack() {
    System.out.println("zhi zhi!");
  }

  @Override
  public void display() {
    System.out.println("I'm a Rubber Duck!");
  }
}
