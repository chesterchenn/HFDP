package chaptera.b;

public class DecoyDuck extends Duck {
  public static void main(String[] args) {
    DecoyDuck decoy = new DecoyDuck();
    decoy.quack();
    decoy.swim();
    decoy.display();
    decoy.fly();
  }

  @Override
  public void quack() {}

  @Override
  public void display() {
    System.out.println("This is Decoy Duck!");
  }

  @Override
  public void fly() {}
}
