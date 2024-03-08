public class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int metersTraveled;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive() {
        if (batteryDrained() == false) {
            this.battery = this.battery - this.batteryDrain;
            this.metersTraveled = this.speed + this.metersTraveled;
        }
    }

    public boolean batteryDrained() {
        if (this.battery < this.batteryDrain) {
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return this.metersTraveled;
    }

    public static NeedForSpeed nitro() {
        var nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}
