package chaptera.d;

public class DecoyDuck extends Duck {
  public static void main(String[] args) {
    DecoyDuck d = new DecoyDuck();
    d.swim();
    d.display();
    d.performFly();
    d.performQuack();
  }

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("I'm a Decoy Duck!");
  }
}
