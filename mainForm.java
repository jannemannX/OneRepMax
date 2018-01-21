package OneRepMax;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainForm {

  private JButton OKButton;
  private JPanel panel1;
  private JTextField weightInput;
  private JTextField repsInput;
  private JTextField weightOutput;
  private JTextField textField1;
  private JTextField textField2;
  private JTextField textField3;
  private JTextField textField4;
  private JTextField textField5;
  private JTextField textField6;
  private JTextField textField7;
  private JTextField textField8;
  private JTextField textField9;

  public mainForm() {
    OKButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double weight = Double.parseDouble(weightInput.getText());
        int reps = Integer.parseInt(repsInput.getText());
        double[] weightValues = calc(weight, reps);
        int weightR = (int) Math.round(weightValues[0]);
        weightOutput.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[1]);
        textField1.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[2]);
        textField2.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[3]);
        textField3.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[4]);
        textField4.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[5]);
        textField5.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[6]);
        textField6.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[7]);
        textField7.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[8]);
        textField8.setText(Integer.toString(weightR));
        weightR = (int) Math.round(weightValues[9]);
        textField9.setText(Integer.toString(weightR));
      }
    });
  }

  public double[] calc(double weight, int reps) {
    double[] values = {1, 0.95, 0.93, 0.9, 0.87, 0.85, 0.83, 0.8, 0.77, 0.75, 0.73, 0.7};
    values[0] = weight / values[reps - 1];
    for (int i = 1; i < values.length; i++) {
      values[i] *= values[0];
    }
    return values;
  }

  public static void main(String[] args) {
    JFrame fenster = new JFrame("OneRepMax");
    fenster.setContentPane(new mainForm().panel1);
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenster.pack();
    fenster.setVisible(true);
    fenster.setSize(500, 215);
  }
}
