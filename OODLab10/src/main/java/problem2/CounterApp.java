package problem2;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CounterApp {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      // Create model, view, and controller
      CounterModel model = new CounterModel();
      CounterView view = new CounterView();
      CounterController controller = new CounterController(model, view);

      // Make view visible
      view.setVisible(true);
    });
  }
}

