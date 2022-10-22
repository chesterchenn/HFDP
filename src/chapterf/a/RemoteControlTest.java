package chapterf.a;

import chapterf.electricity.GarageDoor;
import chapterf.electricity.Light;

public class RemoteControlTest {
  public static void main(String[] args){
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();

    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

    simpleRemoteControl.setSlot(lightOn);
    simpleRemoteControl.buttonWasPressed();
    simpleRemoteControl.setSlot(lightOff);
    simpleRemoteControl.buttonWasPressed();
    simpleRemoteControl.setSlot(garageDoorOpen);
    simpleRemoteControl.buttonWasPressed();
  }
}
