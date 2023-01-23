import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI implements ActionListener {
     Animal[] animals = {new Bird( "A flying animal", "Bird.png", "Bird", 0), new Fish("A swimming animal", "Fish.png", "Fish" ,6), new Mammal("A walking animal", "Mammal.png","Mammal" , 10)};

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel speciesPanel = new JPanel();
    public GUI() {
        frame.setSize(600, 200);
        panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
        panel.setLayout(new GridLayout(2,3));
        for (int i = 0; i < animals.length; i++){
            JButton button = new JButton();
            JLabel des = new JLabel(animals[i].description);
            des.setHorizontalAlignment(JLabel.CENTER);
            des.setVerticalAlignment(JLabel.TOP);
            button.setIcon(animals[i].icon);
            panel.add(button, i);
            panel.add(des);

            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    speciesPanel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
                    speciesPanel.setLayout(new GridLayout(2,3));
                    speciesPanel.setBackground(Color.YELLOW);
                    panel.setVisible(false);
                    try {
                        displayAnimals(animals[finalI]);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    frame.add(speciesPanel);
                    frame.revalidate();
                    frame.repaint();

                }
            });
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Animals");
        frame.pack();
        frame.setVisible(true);
    }

    private void displayAnimals(Animal a) throws IOException {
        for (int i = 0; i < a.species.length; i++) {
            BufferedImage image = ImageIO.read(new File(a.species[i].name + ".png"));
            JLabel picLabel = new JLabel(new ImageIcon(image));
            speciesPanel.add(picLabel);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
