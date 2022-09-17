package chaptera.d;

public class RubberDuck extends Duck {
  public static void main(String[] args) {
    RubberDuck r = new RubberDuck();
    r.swim();
    r.display();
    r.performFly();
    r.performQuack();
  }

  public RubberDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("I'm a Rubber Duck!");
  }
}
