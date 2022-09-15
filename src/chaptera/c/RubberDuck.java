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
    System.out.println("Rubber! Rubber!");
  }

  @Override
  public void display() {
    System.out.println("This is a Rubber Duck!");
  }
}
