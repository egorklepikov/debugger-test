package com.test.debugger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public abstract class CheckBoxIcon implements Icon {
  public enum State {
    SELECTED, UNSELECTED, SEMI_SELECTED;
  }

  public CheckBoxIcon() {
    super();
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    int w = getIconWidth();
    int h = getIconHeight();
    g.setColor(getCheckMarkColor());
    if (isPaintCheckFrame()) {
      g.drawRect(x, y, w, h);
    }
    if (getState().equals(State.SELECTED)) {
      // draw check sign:
      g.drawLine(x + 9, y + 3, x + 9, y + 3);
      g.drawLine(x + 8, y + 4, x + 9, y + 4);
      g.drawLine(x + 7, y + 5, x + 9, y + 5);
      g.drawLine(x + 6, y + 6, x + 8, y + 6);
      g.drawLine(x + 3, y + 7, x + 7, y + 7);
      g.drawLine(x + 4, y + 8, x + 6, y + 8);
      g.drawLine(x + 5, y + 9, x + 5, y + 9);
      g.drawLine(x + 3, y + 5, x + 3, y + 5);
      g.drawLine(x + 3, y + 6, x + 4, y + 6);
    } else if (getState().equals(State.SEMI_SELECTED)) {
      g.fillRect(x + 2, y + 2, w - 3, h - 3);
    }
  }

  @Override
  public int getIconWidth() {
    return 12;
  }

  @Override
  public int getIconHeight() {
    return 12;
  }

  public abstract Color getCheckMarkColor();

  public abstract boolean isPaintCheckFrame();

  public abstract State getState();
}
