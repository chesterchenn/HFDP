package chapterj.b;

public class GumballMachine {
  State soldState;
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(int numberGumballs) {
    this.count = numberGumballs;
    if (numberGumballs > 0) {
      soldState = new SoldState(this);
      soldOutState = new SoldOutState(this);
      noQuarterState = new NoQuarterState(this);
      hasQuarterState = new HasQuarterState(this);
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("正在发放糖果...");
    if (count != 0) {
      count = count - 1;
    }
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("\n机器库存：").append(count).append("个糖果");
    res.append("\n机器");
    if (state == soldOutState) {
      res.append("已售罄");
    } else if (state == noQuarterState) {
      res.append("正在等待硬币");
    } else if (state == hasQuarterState) {
      res.append("正在等待转动曲柄");
    } else if (state == soldState) {
      res.append("正在发放糖果");
    }
    res.append("\n");
    return res.toString();
  }
}
