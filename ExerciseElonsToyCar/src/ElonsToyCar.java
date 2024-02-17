public class ElonsToyCar {

    private int battery = 100;
    private int distance;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        String displayString = "Driven " + getDistance() + " meters";
        return displayString;
    }

    public String batteryDisplay() {
        if (getBattery() > 0) {
            String displayString = "Battery at " + getBattery() + "%";
            return displayString;
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
       if (getBattery() > 0) {
           distance = distance + 20;
           battery = battery - 1;
       } 
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
