import javax.swing.*;

public class Animal {
    String description;
    ImageIcon icon;

    public Animal(String description, String icon) {
        this.description = description;
        this.icon = new ImageIcon(icon);
    }
}
