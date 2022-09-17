package chaptera.c;

public class RedheadDuck extends Duck implements Flyable, Quackable {
  public static void main(String[] args) {
    RedheadDuck r = new RedheadDuck();
    r.quack();
    r.swim();
    r.display();
    r.fly();
  }

  public void display() {
    System.out.println("I'm a Redhead Duck!!");
  }

  @Override
  public void quack() {
    System.out.println("ga ga!");
  }

  @Override
  public void fly() {
    System.out.println("Duck is flying!");
  }
}
