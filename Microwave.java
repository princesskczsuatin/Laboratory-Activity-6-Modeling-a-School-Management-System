public class Microwave extends Device {
    private int timer;
    private int temperature;

    public Microwave() {
        this.timer = 0;
        this.temperature = 100;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        showStatus();
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Microwave ON - Timer: " + timer +
                    " sec, Temperature: " + temperature + "°C");
        } else {
            System.out.println("Microwave is OFF.");
        }
    }
}
