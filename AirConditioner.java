public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Air Conditioner ON - Fan Speed: " + fanSpeed +
                    ", Temperature: " + temperature + "°C");
        } else {
            System.out.println("Air Conditioner is OFF.");
        }
    }
}
