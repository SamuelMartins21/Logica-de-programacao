public class CarRace {
    public static void main(String[] args) throws Exception {
        /*
         * int speed = 5;
         * int batteryDrain = 100;
         * var car = new NeedForSpeed(speed, batteryDrain);
         * car.drive();
         * 
         * System.out.println(car.distanceDriven());
         * System.out.println(car.batteryDrained());
         * 
         * var carNitro = NeedForSpeed.nitro();
         * carNitro.drive();
         * System.out.println(carNitro.distanceDriven());
         */

        int speed = 2;
        int batteryDrain = 10;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 20;
        var race = new RaceTrack(distance);

        System.out.println(car.distanceDriven());
        System.out.println(race.tryFinishTrack(car));
        System.out.println(car.distanceDriven());
    }
}
