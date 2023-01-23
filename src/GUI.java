import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
     Animal[] animals = {new Bird( "A flying animal", "Bird.png", 0), new Fish("A swimming animal", "Fish.png", 6), new Mammal("A walking animal", "Mammal.png", 10)};

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    public GUI() {
        frame.setSize(600, 200);
        panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
        panel.setLayout(new GridLayout(1,3));
        for (int i = 0; i < animals.length; i++){
            JButton button = new JButton();
            button.setIcon(animals[i].icon);
            panel.add(button);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Animals");
        frame.pack();
        frame.setVisible(true);

        displayAnimals();
    }
    public void displayAnimals() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
