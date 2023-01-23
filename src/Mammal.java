public class Mammal extends Animal{
    int furLevel;

    public Mammal(String description, String icon, int furLevel) {
        super(description, icon);
        this.furLevel = furLevel;
    }
}
