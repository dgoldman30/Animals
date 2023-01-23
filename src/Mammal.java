public class Mammal extends Animal{
    int furLevel;

    public Mammal(String description, String icon, String name,  int furLevel) {
        super(description, icon, name);
        this.furLevel = furLevel;
        this.species[0] = new Human("Silly Humans", "Human.png", "Human", 4);
    }
}
