package chaptera.c;

public class DecoyDuck extends Duck {
  public static void main(String[] args) {
    DecoyDuck decoy = new DecoyDuck();
    decoy.swim();
    decoy.display();
  }

  @Override
  public void display() {
    System.out.println("This is Decoy Duck!");
  }
}
