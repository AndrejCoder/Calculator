package parts;

import javax.swing.*;

public class Display extends JLabel {

    public String buildDisplayValue(JButton button){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getText());
        sb.append(button.getText());
        return sb.toString();
    }
}
