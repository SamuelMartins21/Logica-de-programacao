public class App {
    public static void main(String[] args) throws Exception {

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println(birdCount.getCountForFirstDays(20));
    }
}
