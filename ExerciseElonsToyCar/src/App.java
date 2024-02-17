public class App {
    public static void main(String[] args) throws Exception {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.batteryDisplay());
        System.out.println(car.distanceDisplay());
        car.drive();
        System.out.println(car.batteryDisplay());
        System.out.println(car.distanceDisplay());
        car.setBattery(0);
        System.out.println("----------------------");
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
