import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolGui {

    private JButton _mustSeenButton = new JButton("Must-seen");

    public void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        addAButton(_mustSeenButton, pane);
        _mustSeenButton.addActionListener(e -> mustSeenButtonPressed());

    }

    public void addAButton(JButton button, Container container) {
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }

    public void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Riga");
        frame.setPreferredSize(new Dimension(400, 150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public void mustSeenButtonPressed() {
        System.out.println("h");
    }
}

