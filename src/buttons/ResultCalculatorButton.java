package buttons;


import parts.Display;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.*;

public class ResultCalculatorButton extends CalculatorButton<ResultCalculatorButton> {

    public ResultCalculatorButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        gridbag.setConstraints(this, c);
        this.setText(name);
        this.setDisplay(display);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        this.addActionListener(e -> {
            try {
                display.setText(String.valueOf(engine.eval(display.getText())));
            } catch (ScriptException e1) {
                e1.printStackTrace();
            }
        });
    }
}
