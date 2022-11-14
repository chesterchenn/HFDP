package chapterj.b;

public class SoldOutState implements State {
  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("无法投入硬币，机器已售罄");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("无法退回硬币，你并没有投入硬币");
  }

  @Override
  public void turnCrank() {
    System.out.println("转动曲柄，没有糖果可以发放");
  }

  @Override
  public void dispense() {
    System.out.println("无法发放糖果");
  }
}
