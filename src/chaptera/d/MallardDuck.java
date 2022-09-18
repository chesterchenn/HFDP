package chaptera.d;

public class MallardDuck extends Duck {

  public static void main(String[] args) {
    MallardDuck m = new MallardDuck();
    m.setFlyBehavior(new FlyWithWings());
    m.setQuackBehavior(new Quack());
    m.swim();
    m.display();
    m.performFly();
    m.performQuack();
  }

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a Mallard duck!");
  }
}
