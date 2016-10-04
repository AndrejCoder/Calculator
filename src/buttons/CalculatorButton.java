package buttons;

import parts.Display;

import javax.swing.*;


public class CalculatorButton<T extends JButton> extends JButton {

    private Display display;

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return this.display;
    }
}
