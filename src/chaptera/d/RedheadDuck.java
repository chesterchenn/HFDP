package chaptera.d;

public class RedheadDuck extends Duck {

  public static void main(String[] args) {
    RedheadDuck r = new RedheadDuck();
    r.swim();
    r.display();
    r.performFly();
    r.performQuack();
  }

  public RedheadDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a Redhead duck!");
  }
}
