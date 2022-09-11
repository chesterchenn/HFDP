package chaptera.a;

public class RedheadDuck extends Duck {
  public static void main(String[] args) {
    RedheadDuck r = new RedheadDuck();
    r.quack();
    r.swim();
    r.display();
  }

  public void display() {
    System.out.println("I'm a real Redhead Duck!");
  }
}
