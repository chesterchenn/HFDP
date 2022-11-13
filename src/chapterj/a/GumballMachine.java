package chapterj.a;

public class GumballMachine {
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_QUARTER;
    }
  }

  // 投入硬币
  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("你不能投入另一个硬币");
    } else if (state == NO_QUARTER) {
      System.out.println("你投入一个硬币");
      state = HAS_QUARTER;
    } else if (state == SOLD_OUT) {
      System.out.println("你不能投入硬币，机器已经售罄");
    } else if (state == SOLD) {
      System.out.println("请稍等，我们正在给你发放糖果");
    }
  }

  // 退回硬币
  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("退回硬币");
      state = NO_QUARTER;
    } else if (state == NO_QUARTER) {
      System.out.println("你没有投入硬币");
    } else if (state == SOLD) {
      System.out.println("对不起，你已经转动曲柄");
    } else if (state == SOLD_OUT) {
      System.out.println("无法退回，你没有投入硬币");
    }
  }

  // 转动曲柄
  public void turnCrank() {
    if (state == SOLD) {
      System.out.println("连续转动曲柄不会得到多一个糖果");
    } else if (state == NO_QUARTER) {
      System.out.println("需要投入硬币");
    } else if (state == SOLD_OUT) {
      System.out.println("糖果已经售罄");
    } else if (state == HAS_QUARTER) {
      System.out.println("转动曲柄。。。");
      state = SOLD;
      dispense();
    }
  }

  // 发放糖果
  public void dispense() {
    if (state == SOLD) {
      System.out.println("发放糖果");
      count = count - 1;
      if (count == 0) {
        System.out.println("糖果已经售罄");
        state = SOLD_OUT;
      } else {
        state = NO_QUARTER;
      }
    } else if (state == NO_QUARTER) {
      System.out.println("需要投入硬币");
    } else if (state == SOLD_OUT) {
      System.out.println("无法发放糖果");
    } else if (state == HAS_QUARTER) {
      System.out.println("无法发放糖果");
    }
  }

  public void refill(int numGumBalls) {
    this.count = numGumBalls;
    state = NO_QUARTER;
  }

  @Override
  public String toString() {
    StringBuffer res = new StringBuffer();
    res.append("\n机器库存：").append(count).append("个糖果");
    res.append("\n机器");
    if (state == SOLD_OUT) {
      res.append("已售罄");
    } else if (state == NO_QUARTER) {
      res.append("正在等待硬币");
    } else if (state == HAS_QUARTER) {
      res.append("正在等待转动曲柄");
    } else if (state == SOLD) {
      res.append("正在发放糖果");
    }
    res.append("\n");
    return res.toString();
  }
}

