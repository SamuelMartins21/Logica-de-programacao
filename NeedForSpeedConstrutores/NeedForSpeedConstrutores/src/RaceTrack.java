public class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() != this.distance && car.batteryDrained() == false) {
            car.drive();
        }
        if (car.distanceDriven() >= this.distance ) {
            return true;
        }
        return false;
    }
}
