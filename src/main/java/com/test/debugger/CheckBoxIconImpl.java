package com.test.debugger;

import java.awt.*;

public class CheckBoxIconImpl extends CheckBoxIcon {
  @Override
  public Color getCheckMarkColor() {
    return new Color(128, 128, 128, 128);
  }

  @Override
  public boolean isPaintCheckFrame() {
    return true;
  }

  @Override
  public State getState() {
    return State.SELECTED;
  }
}
