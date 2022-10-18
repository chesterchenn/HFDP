package chapterf.a;

import chapterf.electricity.Light;

public class RemoteControlTest {
  public static void main(String[] args){
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);

    simpleRemoteControl.setSlot(lightOn);
    simpleRemoteControl.buttonWasPressed();
  }
}
