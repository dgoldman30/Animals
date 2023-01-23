import javax.swing.*;

public class Animal {
    String pic;
    String description;
    ImageIcon icon;

    public Animal(String pic, String description, String icon) {
        this.pic = pic;
        this.description = description;
        this.icon = new ImageIcon(icon);
    }
}
