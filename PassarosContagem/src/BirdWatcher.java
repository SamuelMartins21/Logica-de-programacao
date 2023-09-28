public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] copyLastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return copyLastWeek;
    }

    public int getToday() {
        int[] birdsToday = birdsPerDay.clone();
        return birdsToday[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int teste : birdsPerDay) {
            if (teste == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int contaTot = 0;
        if (numberOfDays <= birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; i++) {
                contaTot += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < birdsPerDay.length; i++) {
                contaTot += birdsPerDay[i];
            }
            return contaTot;
        }
        return contaTot;
    }

    public int getBusyDays() {
        int contaTot = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                contaTot += 1;
            }
        }
        return contaTot;
    }
}
