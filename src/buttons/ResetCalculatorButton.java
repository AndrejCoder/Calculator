package buttons;


import parts.Display;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.*;

public class ResetCalculatorButton extends CalculatorButton<ResetCalculatorButton> {

    public ResetCalculatorButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        gridbag.setConstraints(this, c);
        this.setText(name);
        this.setDisplay(display);
        this.addActionListener(e -> display.setText(""));
    }
}
