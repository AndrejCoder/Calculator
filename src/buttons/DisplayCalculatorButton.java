package buttons;

import parts.Display;

import javax.swing.*;
import java.awt.*;


public class DisplayCalculatorButton<T extends JButton> extends CalculatorButton<T> {

    public DisplayCalculatorButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        gridbag.setConstraints(this, c);
        this.setText(name);
        this.setDisplay(display);
        this.addActionListener(e -> display.setText(display.buildDisplayValue(DisplayCalculatorButton.this)));
    }
}
