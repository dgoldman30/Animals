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
     Bird[] birds = {new Cardinal("Red Bird", "Cardinal.png", "Cardinal", 10)};
     Mammal[] mammals = {new Human("Silly Humans", "Human.png", "Human", 4)};
     Fish[] fish = {new Fish("Let's get bassy", "Bass.png", "Bass", 4)};
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel speciesPanel = new JPanel();
    public GUI() {
        frame.setSize(600, 200);
        panel.setBackground(Color.GREEN);
        panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
        panel.setLayout(new GridLayout(2,3));
        for (int i = 0; i < animals.length; i++){
            JButton button = new JButton();
            JLabel des = new JLabel(animals[i].description);
            des.setHorizontalAlignment(JLabel.CENTER);
            des.setVerticalAlignment(JLabel.TOP);
            button.setIcon(animals[i].icon);
            panel.add(button,JButton.CONTENT_AREA_FILLED_CHANGED_PROPERTY, i);
            panel.add(des);

            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    speciesPanel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
                    speciesPanel.setLayout(new GridLayout(2,10));
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
        switch (a.name) {
            case "Bird": {
                for (int i = 0; i < birds.length; i++){
                    BufferedImage myPicture = ImageIO.read(new File(birds[i].name + ".png"));
                    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                    JLabel underLabel = new JLabel(birds[i].name);
                    speciesPanel.add(picLabel);
                    underLabel.setVerticalAlignment(JLabel.TOP);
                    underLabel.setHorizontalAlignment(JLabel.CENTER);
                    speciesPanel.add(underLabel);
                }
                break;
            }
            case "Fish": {
                for (int i = 0; i < fish.length; i++){
                    BufferedImage myPicture = ImageIO.read(new File(fish[i].name + ".png"));
                    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                    JLabel underLabel = new JLabel(fish[i].name);
                    speciesPanel.add(picLabel);
                    underLabel.setVerticalAlignment(JLabel.TOP);
                    underLabel.setHorizontalAlignment(JLabel.CENTER);
                    speciesPanel.add(underLabel);
                }
                break;
            }
            case "Mammal": {
                for (int i = 0; i < mammals.length; i++){
                    BufferedImage myPicture = ImageIO.read(new File(mammals[i].name + ".png"));
                    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                    JLabel underLabel = new JLabel(mammals[i].name);
                    speciesPanel.add(picLabel);
                    underLabel.setVerticalAlignment(JLabel.TOP);
                    underLabel.setHorizontalAlignment(JLabel.CENTER);
                    speciesPanel.add(underLabel);
                }
                break;
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
