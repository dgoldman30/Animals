public class Bird extends Animal{
    int flightHours;

    public Bird(String pic, String description, String icon, int flightHours) {
        super(pic, description, icon);
        this.flightHours = flightHours;
    }
}
