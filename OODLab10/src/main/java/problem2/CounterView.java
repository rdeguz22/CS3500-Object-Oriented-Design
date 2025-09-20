package problem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame implements CounterObserver {

  private JLabel countLabel;
  private JButton incrementButton;
  private JButton decrementButton;
  private JButton resetButton;

  public CounterView() {
    setupGUI();
  }

  private void setupGUI() {
    setTitle("Counter MVC Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Create and initialize GUI components
    countLabel = new JLabel("Count: 0", SwingConstants.CENTER);
    countLabel.setFont(new Font("Arial", Font.BOLD, 24));

    // Create buttons
    incrementButton = new JButton("Increment");
    decrementButton = new JButton("Decrement");
    resetButton = new JButton("Reset");

    // Create button panel
    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.add(incrementButton);
    buttonPanel.add(decrementButton);
    buttonPanel.add(resetButton);

    // Add components to frame
    add(countLabel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    pack();
    setLocationRelativeTo(null);
  }

  @Override
  public void update(CounterModel model) {
    countLabel.setText("Count: " + model.getCount());
  }

  public void addIncrementListener(ActionListener listener) {
    incrementButton.addActionListener(listener);
  }

  public void addDecrementListener(ActionListener listener) {
    decrementButton.addActionListener(listener);
  }

  public void addResetListener(ActionListener listener) {
    resetButton.addActionListener(listener);
  }
}
