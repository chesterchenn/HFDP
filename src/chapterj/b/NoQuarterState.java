package chapterj.b;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("你成功投入一枚硬币");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("你没有投入硬币");
  }

  @Override
  public void turnCrank() {
    System.out.println("转动曲柄，你没有投入硬币");
  }

  @Override
  public void dispense() {
    System.out.println("你需要先投入硬币");
  }
}
