package chapterg.a;

public class DuckTestDrive {
  public static void main(String[] args){
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    Turkey duckAdapter = new DuckAdapter(duck);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    duck.quack();
    duck.fly();

    System.out.println("\nThe TurkeyAdapter says...");
    turkeyAdapter.quack();
    turkeyAdapter.fly();

    System.out.println("\nThe DuckAdapter says...");
    duckAdapter.gobble();
    duckAdapter.fly();
  }
}
