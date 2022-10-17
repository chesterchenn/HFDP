package chaptere.a;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  public ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      // 在锅炉内填满巧克力和牛奶的混合物
    }
  }

  public void drain() {
    if(!isEmpty() && isBoiled()) {
      // 排出煮沸的巧克力和牛奶
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isEmpty()) {
      // 将锅炉煮沸
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
