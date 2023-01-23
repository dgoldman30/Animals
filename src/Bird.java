public class Bird extends Animal{
    int flightHours;

    public Bird(String description, String icon, int flightHours) {
        super(description, icon);
        this.flightHours = flightHours;
    }
}
