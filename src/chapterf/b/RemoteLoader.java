package chapterf.b;

import chapterf.command.GarageDoorDownCommand;
import chapterf.command.GarageDoorOpenCommand;
import chapterf.command.LightOffCommand;
import chapterf.command.LightOnCommand;
import chapterf.electricity.GarageDoor;
import chapterf.electricity.Light;

public class RemoteLoader {
  public static void main(String[] args){
    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();

    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);

    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

    remoteControl.setCommand(0, lightOn, lightOff);
    remoteControl.setCommand(1, garageDoorOpen, garageDoorDown);

    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
  }
}
