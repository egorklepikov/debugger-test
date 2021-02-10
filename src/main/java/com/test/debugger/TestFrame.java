package com.test.debugger;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {
  private final TestPanel testPanel;

  public static void main(String[] args) {
    new TestFrame();
  }

  public TestFrame() throws HeadlessException {
    testPanel = new TestPanel();
    setSize(500, 500);
    add(testPanel);
    setVisible(true);
  }
}
