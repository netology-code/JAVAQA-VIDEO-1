public class Conditioner {
    private int maxTemperature = 30;
    private int minTemperature = 10;
    private int currentTemperature = minTemperature;

    public Conditioner(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.currentTemperature = minTemperature;
    }

    public Conditioner(int size) {
        maxTemperature = minTemperature + size;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature < 10) {
            return;
        }
        if (newCurrentTemperature > maxTemperature) {
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

    public void increaseTemp50p() {
        int target = currentTemperature * 3 / 2;
        setCurrentTemperature(target);
    }

    public void setToMaxTemp() {
        currentTemperature = maxTemperature;
    }
}
