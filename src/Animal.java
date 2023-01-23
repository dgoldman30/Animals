import javax.swing.*;

public class Animal {
    String description;
    ImageIcon icon;
    String name;
    Animal[] species = new Animal[2];
    public Animal(String description, String icon, String name) {
        this.description = description;
        this.icon = new ImageIcon(icon);
        this.name = name;
    }


}
