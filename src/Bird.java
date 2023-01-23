public class Bird extends Animal{
    int flightHours;

    public Bird(String description, String icon, String name,  int flightHours) {
        super(description, icon, name);
        this.flightHours = flightHours;

    }
}
