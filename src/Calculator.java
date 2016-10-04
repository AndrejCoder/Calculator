import buttons.DisplayCalculatorButton;
import buttons.ResetCalculatorButton;
import buttons.ResultCalculatorButton;
import parts.Display;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Calculator extends Applet {

    private List<Integer> digitalButtonList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    private static final Integer NUMBER_BUTTONS_BY_ROW = 4;

    protected void makeDisplayButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        DisplayCalculatorButton d1 = new DisplayCalculatorButton(name, gridbag, c, display);
        add(d1);
    }

    protected void makeResultButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        ResultCalculatorButton d1 = new ResultCalculatorButton(name, gridbag, c, display);
        add(d1);
    }

    protected void makeResetButton(String name, GridBagLayout gridbag, GridBagConstraints c, Display display) {
        ResetCalculatorButton d1 = new ResetCalculatorButton(name, gridbag, c, display);
        add(d1);
    }

    protected Label makelabel(String name,
                              GridBagLayout gridbag,
                              GridBagConstraints c) {
        Label label = new Label(name);
        gridbag.setConstraints(label, c);
        add(label);
        return label;
    }


    @Override
    public void init() {

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setFont(new Font("Verdana", Font.BOLD, 24));
        setLayout(gridbag);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;

        Display display = new Display();

        makeDisplayButton("1", gridbag, c, display);
        makeDisplayButton("2", gridbag, c, display);
        makeDisplayButton("3", gridbag, c, display);
        c.gridwidth = GridBagConstraints.REMAINDER;
        makeDisplayButton("4", gridbag, c, display);

        c.gridwidth = GridBagConstraints.BOTH;
        makeDisplayButton("5", gridbag, c, display);
        makeDisplayButton("6", gridbag, c, display);
        makeDisplayButton("7", gridbag, c, display);
        c.gridwidth = GridBagConstraints.REMAINDER;
        makeDisplayButton("8", gridbag, c, display);

        c.gridwidth = GridBagConstraints.BOTH;
        makeDisplayButton("9", gridbag, c, display);
        makeDisplayButton("0", gridbag, c, display);
        c.gridwidth = GridBagConstraints.REMAINDER;
        makelabel("", gridbag, c);

        c.gridwidth = GridBagConstraints.BOTH;
        makeDisplayButton("+", gridbag, c, display);
        makeDisplayButton("*", gridbag, c, display);
        c.gridwidth = GridBagConstraints.REMAINDER;
        makelabel("", gridbag, c);

        c.gridwidth = GridBagConstraints.BOTH;
        makeResetButton("C", gridbag, c, display);
        c.gridwidth = GridBagConstraints.REMAINDER; //end row
        makeResultButton("=", gridbag, c, display);

        gridbag.setConstraints(display, c);
        add(display);
        setSize(300, 200);

    }


}

