
import javax.swing.*;

public class MainWindow extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(368, 384);
        setLocation(450, 180);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();
    }
}