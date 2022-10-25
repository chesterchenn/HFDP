package chapterh.c;

public class BeverageTest {
  public static void main(String[] args){
    TeaWithHook tea = new TeaWithHook();
    CoffeeWithHook coffee = new CoffeeWithHook();

    System.out.println("\nMaking tea...");
    tea.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
  }
}
