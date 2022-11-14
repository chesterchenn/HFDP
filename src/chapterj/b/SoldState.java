package chapterj.b;

public class SoldState implements State {
  GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("请稍等，正在发放糖果");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("你已经转动曲柄");
  }

  @Override
  public void turnCrank() {
    System.out.println("无法再次转动曲柄");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("糖果已经发放完");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}
