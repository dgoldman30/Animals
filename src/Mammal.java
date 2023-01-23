public class Mammal extends Animal{
    int furLevel;

    public Mammal(String pic, String description, String icon, int furLevel) {
        super(pic, description, icon);
        this.furLevel = furLevel;
    }
}
