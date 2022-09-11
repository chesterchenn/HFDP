package chaptera.a;

public class MallardDuck extends Duck {
  public static void main(String[] args) {
    MallardDuck m = new MallardDuck();
    m.quack();
    m.swim();
    m.display();
  }

  public void display() {
    System.out.println("I'm a real Mallard Duck!");
  }
}
