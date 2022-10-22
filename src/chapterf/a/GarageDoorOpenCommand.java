package chapterf.a;

import chapterf.electricity.GarageDoor;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }
}
