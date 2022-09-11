package chaptera.b;

public abstract class Duck {
  public abstract void display();

  public void quack() {
    System.out.println("gua gua!");
  }

  public void swim() {
    System.out.println("Duck is swimming");
  }

  public void fly() {
    System.out.println("Duck is flying");
  }
}
