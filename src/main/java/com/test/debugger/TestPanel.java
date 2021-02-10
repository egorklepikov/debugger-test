package com.test.debugger;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends JPanel {
  private final CheckBoxIcon checkBoxIcon;

  public TestPanel() {
    checkBoxIcon = new CheckBoxIconImpl();
  }

  @Override
  public void paint(Graphics g) {
   checkBoxIcon.paintIcon(new JCheckBox(), g, 100, 100);
  }
}
