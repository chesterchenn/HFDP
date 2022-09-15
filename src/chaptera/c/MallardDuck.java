package chaptera.c;

public class MallardDuck extends Duck implements Flyable, Quackable {
  public static void main(String[] args) {
    MallardDuck m = new MallardDuck();
    m.quack();
    m.swim();
    m.display();
    m.fly();
  }

  public void display() {
    System.out.println("I'm a real Mallard Duck!");
  }

  @Override
  public void fly() {
    System.out.println("Mallard Duck is Flying");
  }

  @Override
  public void quack() {
    System.out.println("Mallard! Mallard!");
  }
}
