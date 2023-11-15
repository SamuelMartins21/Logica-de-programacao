public class MontagemCarros {
    private double valorInicial;
    private double valorfinal;

    public double productionRatePerHour(int speed) {
        if (speed >= 0 && speed <= 10) {
            this.valorInicial = speed * 221;
            if (speed >= 1 && speed <= 4) {
                return this.valorInicial;
            } else if (speed >= 5 && speed <= 8) {
                this.valorfinal = this.valorInicial * 0.9;
                return this.valorfinal;
            } else if (speed == 9) {
                this.valorfinal = this.valorInicial * 0.8;
                return this.valorfinal;
            } else if (speed == 10) {
                this.valorfinal = this.valorInicial * 0.7;
                return this.valorfinal;
            }
        }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        this.valorInicial = productionRatePerHour(speed) / 60;
        int valorFinalDouble = (int) valorInicial;
        return valorFinalDouble;
    }
}
